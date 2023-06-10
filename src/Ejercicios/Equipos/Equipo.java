/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Equipos;


import ListaD.ListaDoble;
import ListaD.Node;
import java.util.ArrayList;

/**
 *
 * @author estudiante
 */
public class Equipo<A> {
    
    String nombre;
    ListaDoble<Jugador> jugadores;

    public Equipo() {
        jugadores = new ListaDoble();
    }
    
    public void add(Jugador jugador){
        jugadores.add(jugador);
    }
    
    public void verJugadores(){
        jugadores.imprimir();
    }
    
    public ArrayList jugadoresMenoresEdad(){
        ArrayList<Jugador> listaMenores = new ArrayList<Jugador>();
        
        Node<Jugador> aux = jugadores.getInicio();
        
        while(aux != null){
            int edad = aux.getDato().getEdad();
            if(edad < 18){
                listaMenores.add(aux.getDato());
            }     
            
            aux = aux.getSiguiente();   
                       
        }
        
        return listaMenores;
    }
    
    public Jugador buscarJugador(String cedula){    
        Jugador j = null;
        
        Node<Jugador> aux = jugadores.getInicio();
        
        while(aux != null){
            if(aux.getDato().getCedula().equals(cedula)) return j = aux.getDato();
            else aux = aux.getSiguiente();
        }
      
        return j;
    }
    
    public Jugador buscarJugadorMayorPuntaje(){    
        
        Jugador j = null;
        
        Node<Jugador> aux = jugadores.getInicio();
        
        int puntajeMayor = 0;
        
        while(aux != null){
            int puntaje = aux.getDato().getPuntos();
            if(puntajeMayor < puntaje){
                puntajeMayor = puntaje;
                j = aux.getDato();
            }     
            
            aux = aux.getSiguiente();               
        }
      
        return j;
    }
    
    public void aumentarPuntaje(){    
        
        Node<Jugador> aux = jugadores.getInicio();
        
        while(aux != null){      
            int puntajeActual = aux.getDato().getPuntos();
            aux.getDato().setPuntos(puntajeActual+5);
            aux = aux.getSiguiente();               
        }
    }
    
    public ArrayList jugadoresEntre20y25(){
        ArrayList<Jugador> listaEdad = new ArrayList<Jugador>();
        
        Node<Jugador> aux = jugadores.getInicio();
        
        while(aux != null){
            int edad = aux.getDato().getEdad();
            if(edad >= 20 && edad <= 25){
                listaEdad.add(aux.getDato());
            }     
            
            aux = aux.getSiguiente();   
                       
        }
        
        return listaEdad;
    }
    
    
    
    
    
}
