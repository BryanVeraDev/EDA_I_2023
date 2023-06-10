/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Asociacion;

/**
 *
 * @author estudiante
 */
public class TestHashMap {
    public static void main(String[] args) {
        AsociacionTablaHash a = new AsociacionTablaHash();
        
        Mascota m1 = new Mascota("1", "firulais", 3, "1203214");
        Mascota m2 = new Mascota("2", "Dalmata", 5, "12002");
        Mascota m3 = new Mascota("3", "Manchas", 2, "15547");
        Mascota m5 = new Mascota("2");
        Mascota m6 = new Mascota("3","15547");

        a.agregarMascota(m1);
        a.agregarMascota(m2);
        a.agregarMascota(m3);  
        
        System.out.println(a.buscarId(m5));
        System.out.println(a.buscarPropietario(m6));
        
        a.imprimir();
        
    }
    
}
