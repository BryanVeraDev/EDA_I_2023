/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_s;

import Utilidades.Estructura;

/**
 *
 * @author Estudiante
 */
public class Test {
    public static void main(String[] args) {
        SimpleList<String> nombres = new SimpleList();
        nombres.add("Daniela");
        nombres.add("Katerine");
        nombres.add("Angel");
        nombres.addFinal("Andrea");
        nombres.imprimir();
        
        System.out.println("Buscar: si no lo encuentra retorna null");
        System.out.println(nombres.buscar("Dani"));
        
        System.out.println("---Eliminar al inicio---");
        nombres.eliminarInicio();
        nombres.imprimir();
        System.out.println("---Eliminar al final---");
        nombres.eliminarFinal();
        nombres.imprimir();
        System.out.println("---Eliminar segun un dato---");
        nombres.eliminar("Andrea");
        nombres.imprimir();
        
    }
}
