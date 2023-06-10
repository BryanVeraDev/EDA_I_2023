/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaD;

/**
 *
 * @author estudiante
 */
public class Node<A> {
    private Node anterior;
    private Node siguiente;
    private A dato;

    /**
     * @return the anterior
     */
    public Node getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public Node getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the dato
     */
    public A getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(A dato) {
        this.dato = dato;
    }
}
