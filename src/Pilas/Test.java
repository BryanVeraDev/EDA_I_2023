/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author DANIELA
 */
public class Test {
    public static void main(String[] args) {
        Pila<String> p = new Pila();
        p.apilar("hola");
        p.apilar("como");
        p.apilar("estas");
        p.imprimir();
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
        System.out.println(p.desapilar());
    }
}
