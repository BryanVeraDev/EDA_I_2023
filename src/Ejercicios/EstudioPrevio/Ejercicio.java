/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EstudioPrevio;

import ListaD.ListaDoble;
import ListaD.Node;

/**
 *
 * @author BRYAN VERA
 */
public class Ejercicio<A> {
    
    
    public ListaDoble Reemplazar(ListaDoble l, int nuevo, int viejo){
        
        Node<Integer> aux = l.getInicio();
        
        while(aux != null && aux.getDato() <= viejo){
            if(aux.getDato() == viejo){
                aux.setDato(nuevo);
            }  
            aux = aux.getSiguiente();
        }
 
        return l;
        
    }
    
    public ListaDoble MezclaOrdenada(ListaDoble ld1, ListaDoble ld2){
        
        ListaDoble<Integer> mezclalistas = new ListaDoble<Integer>();
        
        Node<Integer> aux1 = ld1.getInicio();
        Node<Integer> aux2 = ld2.getInicio();
        
        
        while(aux1 != null && aux2 != null){
   
            if(aux1.getDato() > aux2.getDato()){
                mezclalistas.addFinal(aux2.getDato());
                aux2 = aux2.getSiguiente();
            }else if(aux1.getDato() < aux2.getDato()){
                mezclalistas.addFinal(aux1.getDato());
                aux1 = aux1.getSiguiente();
            }else if(aux1.getDato() == aux2.getDato()){
                mezclalistas.addFinal(aux1.getDato());
                mezclalistas.addFinal(aux2.getDato());
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();    
            }
               
            while(aux1 != null && aux2 == null){
                mezclalistas.addFinal(aux1.getDato());
                aux1 = aux1.getSiguiente();
            }    
                
            while(aux2 != null && aux1 == null){
                mezclalistas.addFinal(aux2.getDato());
                aux2 = aux2.getSiguiente();
            }
    
        }
 
        return mezclalistas;
        
    }
    
    public ListaDoble ReemplazarConCero(ListaDoble ld1, ListaDoble ld2){
        
        Node<Integer> aux1 = ld1.getInicio();
        Node<Integer> aux2 = ld2.getInicio();
        
        while(aux1 != null && aux2 != null){
            if(aux1.getDato() == aux2.getDato()){
                int valorEliminar = aux1.getDato();
                    while (aux1 != null && aux1.getDato()== valorEliminar) {
                        aux1.setDato(0);
                        aux1 = aux1.getSiguiente();
                    }
                aux2 = aux2.getSiguiente();
  
            }  else if (aux1.getDato() < aux2.getDato()) {
                aux1 = aux1.getSiguiente();
            } else {
                aux2 = aux2.getSiguiente();
            }
            
        }
 
        return ld1;
    }
    
    public boolean ContenerListaPequeña(ListaDoble ldpequeña, ListaDoble ldgrande){
        boolean promesa = true;
        
        Node<Integer> aux1 = ldpequeña.getInicio();
        Node<Integer> aux2 = ldgrande.getInicio();
        
        while(aux1 != null){
            boolean contiene = false;
            while(aux2 != null && aux2.getDato() <= aux1.getDato() && contiene == false){
                System.out.println("Aux1: " + aux1.getDato());
                System.out.println("Aux2: " + aux2.getDato());
                if(aux1.getDato() == aux2.getDato()){
                    contiene = true;
                }else{
                    aux2 = aux2.getSiguiente();
                }
            }
            System.out.println("FUERA");
            if(contiene == false){
                return false;
            }else{
                aux1 = aux1.getSiguiente();
            }

            
        }
 
        return promesa;
    }
    
    
}
