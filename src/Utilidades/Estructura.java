/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Utilidades;

/**
 *Buscar segun un dato y que retorne lo que hay dentro del nodo
 * Eliminar por el inicio
 * Eliminar al final
 * Eliminar el primero que sea igual al dato que se le pasa
 * @author estudiante
 */
public interface Estructura<A> {
    
    public void add(A dato);
    public void addFinal(A dato);
    public boolean isEmpty();
    public A buscar(A entrada);
    public A eliminarInicio();
    public A eliminarFinal();
    public A eliminar(A dato);
    
}
