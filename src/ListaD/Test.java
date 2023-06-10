/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaD;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        ListaDoble<String> ld = new ListaDoble();
        /*ld.add(1);
        ld.add(1);
        ld.addFinal(2);
        ld.addFinal(2);
        ld.add(3);
        ld.imprimir();
        System.out.println(ld.isEmpty());*/
        
        
        ld.add("uno");
        ld.add("dos");
        ld.add("tres");
        ld.add("cuatro");
        ld.add("cinco");
        ld.add("seis");
        
        
        ld.imprimir();
        System.out.println("Buscar: si no lo encuentra da null");
        System.out.println(ld.buscar("u"));
        System.out.println("------Eliminar al inicio-----");
        ld.eliminarInicio();
        ld.imprimir();
        System.out.println("-----Eliminar al final");
        ld.eliminarFinal();
        ld.imprimir();
        System.out.println("Eliminar según un dato");
        ld.eliminar("cinco");
        ld.imprimir();
 
    }
}
