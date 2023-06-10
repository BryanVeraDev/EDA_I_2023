/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial;

import ListaD.ListaDoble;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        Parcial p = new Parcial();
        
        //Punto 1
        System.out.println("Punto 1 Elementos Contenidos");
        
        ListaDoble lista = new ListaDoble();
        
        lista.addFinal(3);
        lista.addFinal(5);
        lista.addFinal(8);
        lista.addFinal(5);
        lista.addFinal(10);
        lista.addFinal(2);
        lista.addFinal(1);
        lista.imprimir();

        System.out.println("Ordenando segun indice");
        
        p.ejercicio1(lista, 5).imprimir();

        System.out.println("----------------");
        //Punto 2 Mezcla Ordenada
        
        System.out.println("Punto 2 Mezcla Ordenada");
        ListaDoble<Integer> l1 = new ListaDoble<Integer>();
        ListaDoble<Integer> l2 = new ListaDoble<Integer>();
        
        
        l1.addFinal(1);
        l1.addFinal(2);
        l1.addFinal(4);
        
        l2.addFinal(1);
        l2.addFinal(3);
        l2.addFinal(4);
        
        p.MezclaOrdenada(l1, l2).imprimir();
        System.out.println("----------------");
        
        //Punto 3
        System.out.println("Punto 3 Lexicord");
        ListaDoble<Integer> l3 = new ListaDoble<Integer>();
        ListaDoble<Integer> l4 = new ListaDoble<Integer>();
        
        System.out.println("CASO 1");
        
        l3.addFinal(1);
        l3.addFinal(3);
        l3.addFinal(2);
        l3.addFinal(4);
        l3.addFinal(6);
    
        
        l4.addFinal(1);
        l4.addFinal(3);
        l4.addFinal(2);
        l4.addFinal(5);
        
        System.out.println(p.Lexicord(l3, l4));
        
        System.out.println("CASO 2");
        
        ListaDoble<Integer> l5 = new ListaDoble<Integer>();
        ListaDoble<Integer> l6 = new ListaDoble<Integer>();
        
        l5.addFinal(1);
        l5.addFinal(3);
        l5.addFinal(3);
        l5.addFinal(4);
        l5.addFinal(5);
    
        
        l6.addFinal(1);
        l6.addFinal(3);
        l6.addFinal(3);
        
        System.out.println(p.Lexicord(l5, l6));
        
        System.out.println("CASO 3");
        
        ListaDoble<Integer> l7 = new ListaDoble<Integer>();
        ListaDoble<Integer> l8 = new ListaDoble<Integer>();
        
        l7.addFinal(1);
        l7.addFinal(3);
        l7.addFinal(3);
        l7.addFinal(4);
    
        
        l8.addFinal(1);
        l8.addFinal(3);
        l8.addFinal(3);
        l8.addFinal(4);
        
        System.out.println(p.Lexicord(l7, l8));
        
        
        
        
        
    }
    
}
