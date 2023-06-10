/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author DANIELA
 */
public class Test {
    public static void main(String[] args) {
         Cola<String> c = new Cola();
         c.encolar("hola");
         c.encolar("como");
         c.encolar("estas");
        c.imprimir();
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        System.out.println(c.desencolar());
        
        
    }
   
}
