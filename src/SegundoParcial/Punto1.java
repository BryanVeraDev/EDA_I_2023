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
public class Punto1 {


    Pila  sacarFondoPila(Pila p1){    
        
        Pila p2 = new Pila();
        
        //Eliminar Final
        if(!p1.esVacia()){
            while(p1.getSize() > 1){
                int elemento = (Integer)p1.getCima().getDato();
                p1.desapilar();
                p2.apilar(elemento);
            }
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
