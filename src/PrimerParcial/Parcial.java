/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial;

import ListaD.ListaDoble;
import ListaD.Node;

/**
 *
 * @author estudiante
 */
public class Parcial {
    
    public ListaDoble ejercicio1(ListaDoble lista, int x){
        ListaDoble<Integer> lista2 = new ListaDoble();
        Node<Integer> aux = lista.getInicio();
        while(aux != null){
            if(aux.getDato() < x){
                lista2.add(aux.getDato());
            }
            else if(aux.getDato() >= x) {
                lista2.addFinal(aux.getDato());
            }
            
            aux = aux.getSiguiente();
        }
        return lista2;
    }
    
    public ListaDoble MezclaOrdenada(ListaDoble ld1, ListaDoble ld2){
        
        ListaDoble<Integer> mezclalistas = new ListaDoble<Integer>();
        
        Node<Integer> aux1 = ld1.getInicio();
        Node<Integer> aux2 = ld2.getInicio();
        
        
        while(aux1 != null && aux2 != null){
   
            if(aux1.getDato() > aux2.getDato()){
                mezclalistas.addFinal(aux2.getDato());
                aux2 = aux2.getSiguiente();
            }else if(aux1.getDato() < aux2.getDato()){
                mezclalistas.addFinal(aux1.getDato());
                aux1 = aux1.getSiguiente();
            }else if(aux1.getDato() == aux2.getDato()){
                mezclalistas.addFinal(aux1.getDato());
                mezclalistas.addFinal(aux2.getDato());
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();    
            }
               
            while(aux1 != null && aux2 == null){
                mezclalistas.addFinal(aux1.getDato());
                aux1 = aux1.getSiguiente();
            }    
                
            while(aux2 != null && aux1 == null){
                mezclalistas.addFinal(aux2.getDato());
                aux2 = aux2.getSiguiente();
            }
    
        }
 
        return mezclalistas;   
    }
    
    public boolean Lexicord(ListaDoble ld1, ListaDoble ld2){
        
        boolean contiene = true;
        
        Node<Integer> aux1 = ld1.getInicio();
        Node<Integer> aux2 = ld2.getInicio();
        
        while(aux1 != null && aux2 != null){
            
            if(aux1.getDato() == aux2.getDato()){
                aux1 = aux1.getSiguiente();
                aux2 = aux2.getSiguiente();
            }else if(aux1.getDato() > aux2.getDato()){  
                return true;
            }else if(aux1.getDato() < aux2.getDato()){
                return false;
            }
            
            if(aux1 == null && aux2 != null && contiene){
                return false;
            }
            
            if(aux1 == null && aux2 == null && contiene){
                return false;
            }
            
        }
        
        
        
        return contiene;
    }
    
}
