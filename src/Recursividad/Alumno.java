/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursividad;

import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Matias
 */
public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private String direccion;
    private float promedio;

    public Alumno(String nombre, String direccion, float promedio) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", direccion=" + direccion + ", promedio=" + promedio + '}';
    }
    
    @Override
    public int hashCode(){
        return nombre.hashCode() + direccion.hashCode();
    }
    
    @Override
    public boolean equals(Object otro){
        if (otro.getClass() != Alumno.class) return false;
        Alumno otroAlumno = (Alumno)otro;
        return otroAlumno.nombre.equals(this.nombre)
                && otroAlumno.direccion.equals(this.direccion);
    }
     @Override
    public int compareTo(Alumno o) {
        //return nombre.compareTo(o.nombre);
        return Float.compare(promedio, o.promedio);
        
    }
    
    public static void main(String[] args) {
        Set<Alumno> set = new TreeSet<>();
        set.add(new Alumno("Jose","av 1",2.5F));
        set.add(new Alumno("Antonio","av 2",2.6F));
        set.add(new Alumno("Maria","av 3",2.7F));
        for(Alumno a:set){
            System.out.println(a);
            
        }
        System.out.println("-------");
        set.add(new Alumno("Jose","av 1",2.8F));
        for(Alumno a:set){
            System.out.println(a);
            
        }
        
        Alumno a = new Alumno("Jose","av 1",2.5F);
        Alumno a1 = new Alumno("Jose","av 1",2.3F);
        
        System.out.println("compare to: " + a.compareTo(a));
        
        System.out.println("comparar dos objetos: " + new Alumno("Maria","av 3",2.7F).equals(
                new Alumno("Maria","av 3",2.8F)) );
    }

   
    
    
}
