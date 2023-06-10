/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Asociacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author estudiante
 */
public class AsociacionTablaHash {
    
    Map<String, Mascota> mascotas;

    public AsociacionTablaHash() {
        this.mascotas = new HashMap<>();
    }
    
    public void agregarMascota(Mascota mascota){
        if(mascota != null){
            mascotas.put(mascota.getId(), mascota);
        }  
    }
    
    public Mascota buscarId(Mascota mascota){

        return mascotas.get(mascota.getId());

    }
    
    public Mascota buscarPropietario(Mascota mascota){
        
        String idPropietario = mascota.getCedula();
        
        for (Map.Entry<String, Mascota> entry : mascotas.entrySet()) {
            Mascota m = entry.getValue();
            if(idPropietario.equals(m.getCedula())){  
                return m;
            }
        }
        
        return null;
    }
    
    public void imprimir(){
        mascotas.forEach((key,value) -> {        
            System.out.println("Clave: " + key + " - > " + value);
        });
    }
    
    
    
}
