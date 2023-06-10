/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoParcial;

import Colas.Cola;
import Colas.Node;
import Pilas.Pila;

/**
 *
 * @author estudiante
 */
public class Punto4 {

Cola invertirCola(Cola c1){    
        
        Cola c2 = new Cola();
        int contador = 0;
        boolean par = false;
        Node aux = c1.getInicio();

        while(aux != null){ 
            if((Integer)aux.getDato() % 2 == 0){
              par = true;       
            }else{
               contador++; 
            }
            if(par){
                c2.encolar(aux.getDato());
            }
            aux = aux.getSiguiente();            
        }  
        
        //Agregar los elementos de la Pila a la Cola para invertir
        aux = c1.getInicio();
        while (contador > 0) {
            c2.encolar(aux.getDato());
            aux = aux.getSiguiente();
            contador--;
        }

        return c2;
   
    }
    
}
