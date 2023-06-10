/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoParcial;

import Colas.Cola;
import Pilas.Pila;

/**
 *
 * @author estudiante
 */
public class Punto2 {

    Cola invertirCola(Cola c1){    
        
        Pila p1 = new Pila();
        
        //Pasar los Elementos de la Cola a la Pila
        if(!c1.esVacia()){
            while(c1.getSize() > 1){
                int elemento = (Integer)c1.getInicio().getDato();
                c1.desencolar();
                p1.apilar(elemento);
            }
        }   

        //Agregar los elementos de la Pila a la Cola para invertir
       
        while (!p1.esVacia()) {
            int elemento = (Integer) p1.getCima().getDato();
            p1.desapilar();
            c1.encolar(elemento);
        }

        return c1;
   
    }
    
}
