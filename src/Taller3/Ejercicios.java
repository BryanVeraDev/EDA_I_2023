/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3;

import Colas.Cola;
import Colas.Node;
import Pilas.Pila;

/**
 *
 * @author auxiliaras
 */
public class Ejercicios {
    
    Cola eliminar_valor(Cola c1, int n){    
        
        Cola c2 = new Cola();
        
        if(!c1.esVacia()){
            Node aux = c1.getInicio();
            while(aux != null){
                if((Integer)aux.getDato() != n){
                    c2.encolar(aux.getDato());
                }   
                aux = aux.getSiguiente();
            }      
        }
        
        //Otra forma
        /*while(!c1.esVacia()){
            int elemento = (Integer)c1.getInicio().getDato();
            c1.desencolar();
            if(elemento != n){
                c2.encolar(elemento);
            }
        }*/
        

        return c2;
   
    }
    
    void juntar_Elementos(Pila p1, int n){
        int suma = 0;
        if(!p1.esVacia()){
            if(n < p1.getSize()){
            while(n > 0){
                suma += (Integer) p1.getCima().getDato();
                p1.desapilar();
                n--;
            } 
            
            p1.apilar(suma);
        }else{
            while(p1.getSize() > 0){
                suma += (Integer) p1.getCima().getDato();           
                p1.desapilar();
            }
            p1.apilar(suma);
        }
            
        }    
    }
    
    Pila reorganizar_Pila(Pila p1, int n){
        Pilas.Node aux = p1.getCima();
        Pila p2 = new Pila();
        
        boolean encontro = false;
        
        while(aux != null){
            if((Integer)aux.getDato() == n){
                encontro = true;
            }
            aux = aux.getSiguiente();        
        }
        
        if(!encontro){
            p1.apilar(n);
            return p1;
        }else{
            Pila auxPila = new Pila();
            while(!p1.esVacia()){
                if((Integer)p1.getCima().getDato()!= n){
                    auxPila.apilar(p1.getCima().getDato());
                }   
                p1.desapilar();
            }
            
            while(!auxPila.esVacia()){
                
                p2.apilar(auxPila.getCima().getDato());
                auxPila.desapilar();
            }
            
            p2.apilar(n);
        }

         return p2;
    }
    
    Pila insertarFinal(Pila p1){
        
        Pila p2 = new Pila();
        
        if(!p1.esVacia()){
            int i=  valorMinimoPila(p1, (Integer) p1.getCima().getDato());
        
            p2.apilar(i);
        
            Pila auxPila = new Pila();
            while(!p1.esVacia()){
                if((Integer)p1.getCima().getDato()!= i){
                    auxPila.apilar(p1.getCima().getDato());
                }   
                p1.desapilar();
            }
            
            while(!auxPila.esVacia()){
                p2.apilar(auxPila.getCima().getDato());
                auxPila.desapilar();
            }
        }
        return p2;
    }
    
    Pila crearPilaAuxiliarIdentica(Pila p){
        
        Pila nuevaPila = new Pila<>();
        Pila pilaAuxiliar = new Pila<>();

        while (!p.esVacia()) {
            int elemento = (Integer) p.getCima().getDato();
            p.desapilar();
            pilaAuxiliar.apilar(elemento);
        }

        while (!pilaAuxiliar.esVacia()) {
            int elemento = (Integer) pilaAuxiliar.getCima().getDato();
            pilaAuxiliar.desapilar();
            nuevaPila.apilar(elemento);
            p.apilar(elemento);
        }
        
        return nuevaPila;
        
    }
    
    int valorMinimoPila(Pila p, int menor){
        
        Pila nuevaPila = crearPilaAuxiliarIdentica(p);

        if(!nuevaPila.esVacia()){
            int elemento = (Integer)nuevaPila.getCima().getDato();
            nuevaPila.desapilar();
            if(elemento <= menor){
                menor = elemento;
            } 
            
            menor = valorMinimoPila(nuevaPila, menor);
            
        }

        return menor;
    }
    
    
    
}
