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
public class Jugador {
    private String nombre;
    private int edad;
    private double estatura;
    private String cedula;
    private int puntos;

    public Jugador(String nombre, int edad, double estatura, String cedula, int puntos) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.cedula = cedula;
        this.puntos = puntos;
    }

    public Jugador() {
    }

    @Override
    public String toString(){
        return "Nombre: " + nombre + " Edad:" + edad + " Estatura: "+ estatura + " Cedula: " + cedula + " Puntos: " + puntos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the estatura
     */
    public double getEstatura() {
        return estatura;
    }

    /**
     * @param estatura the estatura to set
     */
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the puntos
     */
    public int getPuntos() {
        return puntos;
    }

    /**
     * @param puntos the puntos to set
     */
    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
}
