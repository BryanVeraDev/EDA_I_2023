/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablaHash;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author estudiante
 */
public class TablaHash {
    public static void main(String[] args) {
        
        Map<String, Alumno> mapa = new HashMap<>();     
        Alumno a1 = new Alumno("Bryan", "Vera", "1156412", "Cll 11");  
        
        mapa.put(a1.getCodigo(), a1);
        
        System.out.println(mapa.get(a1.getCodigo()));
        
    }
    
}
