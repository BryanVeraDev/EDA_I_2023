/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.EstudioPrevio;

import ListaD.ListaDoble;


/**
 *
 * @author BRYAN VERA
 */
public class Test {
    public static void main(String[] args) {
        Ejercicio e = new Ejercicio();
        ListaDoble<Integer> l = new ListaDoble<Integer>();
        ListaDoble<Integer> l2 = new ListaDoble<Integer>();
        
        l.addFinal(1);
        l.addFinal(5);
        l.addFinal(5);
        l.addFinal(8);
        l.addFinal(18);
        l.addFinal(20);
        l.addFinal(22);
        
        l2.addFinal(1);
        l2.addFinal(8);
        l2.addFinal(18);
        l2.addFinal(20);
        
        System.out.println("Remplazar");
        //e.Reemplazar(l, 2, 5).imprimir();
        System.out.println("---------");
        System.out.println("Mezclar");
        e.MezclaOrdenada(l, l2).imprimir();
       //System.out.println("---------");
       // System.out.println("Cero");
        //e.ReemplazarConCero(l, l2).imprimir();
        System.out.println("---------");
        System.out.println("Contiene");
        System.out.println(e.ContenerListaPequeña(l2, l));
        
        
        

        
    }
    
}
