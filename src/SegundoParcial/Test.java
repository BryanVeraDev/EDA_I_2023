/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SegundoParcial;

import Colas.Cola;
import Pilas.Pila;
import Taller3.Ejercicios;

/**
 *
 * @author estudiante
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("\t" + "Actividad Colas y Pilas");
        System.out.println("----||----||----||----||----||----||----");

        System.out.println("Punto 1");

        Punto1 punto1 = new Punto1();
        Pila p1 = new Pila();
        Pila p2 = new Pila();

        p1.apilar(1);
        p1.apilar(2);
        p1.apilar(3);
        
        p2 = punto1.sacarFondoPila(p1);
        p2.imprimir();

        System.out.println("----||----||----||----||----||----||----");
        System.out.println("Punto 2");

        Punto2 punto2 = new Punto2();
        Cola c1 = new Cola();
        Cola c2 = new Cola();
       
        c1.encolar(12);
        c1.encolar(4);
        c1.encolar(23);
        c1.encolar(10);
        c1.encolar(1);

        c2 = punto2.invertirCola(c1);
        c2.imprimir();

        System.out.println("----||----||----||----||----||----||----");
        System.out.println("Punto 3");

        Punto3 punto3 = new Punto3();
        Pila p3 = new Pila();
        Pila p4 = new Pila();

        p3.apilar(9);
        p3.apilar(2);
        p3.apilar(8);
        p3.apilar(6);
        p3.apilar(7);
        p3.apilar(5);
        p3.apilar(3);
        p3.apilar(2);
        p3.apilar(4);
        p3.apilar(3);
        p3.apilar(1);

        p2 = punto3.ordenarParesEImpares(p3);
        p2.imprimir();

        System.out.println("----||----||----||----||----||----||----");
        System.out.println("Punto 4");

        Punto4 punto4 = new Punto4();
        Cola c3 = new Cola();
        Cola c4 = new Cola();

        c3.encolar(1);
        c3.encolar(3);
        c3.encolar(5);
        c3.encolar(2);
        c3.encolar(4);

        c4 = punto4.invertirCola(c3);
        c4.imprimir();





    }


    
}
