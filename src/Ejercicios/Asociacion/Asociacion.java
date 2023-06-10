/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.Asociacion;

import ListaD.ListaDoble;

/**
 *
 * @author estudiante
 */
public class Asociacion {
    
    ListaDoble<Mascota> mascotas;

    public Asociacion() {
        mascotas = new ListaDoble();
    }
    
    public void add(Mascota mascota){
        mascotas.add(mascota);
    }

    public void verMascotas(){
        mascotas.imprimir();
    }
    
    public Mascota buscar(Mascota m){
       
        Mascota m1 = mascotas.buscar(m);
        
        return m1;
    }
    
    public Mascota eliminar(Mascota m){
        Mascota m1 = mascotas.eliminar(m);
        
        return m1;
    }
    
  

}
