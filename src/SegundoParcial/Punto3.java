/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoParcial;

import Colas.Node;
import Pilas.Pila;

/**
 *
 * @author estudiante
 */
public class Punto3 {

    Pila ordenarParesEImpares(Pila p1){    
        
        Pila p2 = new Pila();
        
        //Tener los Elementos de la Cola pares

        Pilas.Node aux = p1.getCima();
        while(aux != null){ 
            if((Integer)aux.getDato() % 2 == 0){
              p2.apilar(aux.getDato());
            } 
            aux = aux.getSiguiente();
        }

        //Tener los Elementos de la Cola Impares

        aux = p1.getCima();

        while(aux != null){ 
            if((Integer)aux.getDato() % 2 != 0){
              p2.apilar(aux.getDato());
            } 
            aux = aux.getSiguiente();
        }

        //Invertir Pila
       
        Pila pilaAuxiliar = new Pila<>();

        while (!p2.esVacia()) {
            int elemento = (Integer) p2.getCima().getDato();
            p2.desapilar();
            pilaAuxiliar.apilar(elemento);
        }

        return pilaAuxiliar;
   
    }
    
}
