/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Asociacion;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        Asociacion a = new Asociacion();
        
        Mascota m1 = new Mascota("1", "Kadnita", 8, "1111111"); 
        Mascota m2 = new Mascota("2", "Firulais", 5, "989894");
        Mascota m3 = new Mascota("3", "Jesk", 2, "354786");
        a.add(m1);
        a.add(m2);
        a.add(m3);
        
        Mascota m4 = new Mascota("15" , "Brbr", 6, "bdbdbd");;
        a.eliminar(m1);
        
        a.verMascotas();
       
        


    }
}
