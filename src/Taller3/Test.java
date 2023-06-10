/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3;

import Colas.Cola;
import Pilas.Pila;

/**
 *
 * @author auxiliaras
 */
public class Test {
    public static void main(String[] args) {
        
        Ejercicios e = new Ejercicios();
        
        System.out.println("\t" + "Actividad Colas y Pilas");
        System.out.println("----||----||----||----||----||----||----");
        
    
        Cola c = new Cola();
        Cola c1 = new Cola();
        Pila p = new Pila();
        Pila p1 = new Pila();
        Pila p2 = new Pila();
        
        System.out.println("Punto 1");
        c.encolar(1);
        c.encolar(3);
        c.encolar(5);
        c.encolar(4);
        c.encolar(2);
        c.encolar(3);
        c.encolar(7);
        c.encolar(3);
        c.encolar(5);
        c.encolar(3);
        c.encolar(9);
        
        c = e.eliminar_valor(c, 3);
        
        c.imprimir();
        
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("Punto 2");
        
        p.apilar(2);
        p.apilar(3);
        p.apilar(4);    
        p.apilar(5);
        p.apilar(2);
        p.apilar(3);
        p.apilar(1);
        
        e.juntar_Elementos(p, 4);
        p.imprimir();
        
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("Punto 3");
        
        p1.apilar(4);
        p1.apilar(3);
        p1.apilar(2);    
        p1.apilar(5);
        
        p1 = e.reorganizar_Pila(p1, 3);
        
        p1.imprimir();
        
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("Punto 4");
        

        c1.encolar(1);
        c1.encolar(3);
        c1.encolar(5);
        c1.encolar(2);
        c1.encolar(4);
        
        p2 = e.insertarFinal(p2);
        System.out.println("Proceso");
        p2.imprimir();
    
        
        
        
    }   
}
