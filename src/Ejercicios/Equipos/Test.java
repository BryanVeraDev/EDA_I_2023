/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios.Equipos;

/**
 *
 * @author estudiante
 */
public class Test {
    public static void main(String[] args) {
        
        Equipo e = new Equipo();
        
        Jugador j1 = new Jugador("Bryan", 21, 1.72, "1085412532", 8);
        Jugador j2 = new Jugador("Messi", 23, 1.70, "3712542", 10);
        Jugador j3 = new Jugador("Kevin", 17, 1.65, "1090156423", 9);
        Jugador j4 = new Jugador("Neymar", 26, 1.70, "15202312", 20);
        
        e.add(j1);
        e.add(j2);
        e.add(j3);
        e.add(j4);
        
        System.out.println("Buscar Jugador");
        System.out.println(e.buscarJugador("3712542"));
        System.out.println("------------------------------");
        System.out.println("Jugadores Menores de Edad");
        System.out.println(e.jugadoresMenoresEdad());
        System.out.println("------------------------------");
        System.out.println("Jugador con Mayor Puntaje");
        System.out.println(e.buscarJugadorMayorPuntaje());
        System.out.println("------------------------------");
        e.aumentarPuntaje();
        
        System.out.println("Jugadores Entre 20 y 25");
        System.out.println(e.jugadoresEntre20y25());
        System.out.println("El número de jugadores entre 20 y 25 años es: " + e.jugadoresEntre20y25().size());
        System.out.println("------------------------------");
        
        System.out.println("Ver Jugadores");

        e.verJugadores();
        
    }  
}
