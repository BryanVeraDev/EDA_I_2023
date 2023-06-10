    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

/**
 *
 * @author Estudiante
 */
public class Node<A> {
    
    private Node arbolIzquierdo;
    private Node arbolDerecho;
    private A dato;

    public Node(A dato) {
        this.dato = dato;
    }

    public Node() {
    }

    /**
     * @return the arbolIzquiero
     */
    public Node getArbolIzquierdo() {
        return arbolIzquierdo;
    }

    /**
     * @param arbolIzquierdo the arbolIzquiero to set
     */
    public void setArbolIzquierdo(Node arbolIzquierdo) {
        this.arbolIzquierdo = arbolIzquierdo;
    }

    /**
     * @return the arbolDerecho
     */
    public Node getArbolDerecho() {
        return arbolDerecho;
    }

    /**
     * @param arbolDerecho the arbolDerecho to set
     */
    public void setArbolDerecho(Node arbolDerecho) {
        this.arbolDerecho = arbolDerecho;
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
    
        
    public void add(Integer elemento){
        if(elemento < (Integer)dato){
            if(arbolIzquierdo == null){
                arbolIzquierdo = new Node(elemento);
            }else{
                arbolIzquierdo.add(elemento);
            }
        }else{
            if(arbolDerecho == null){
                arbolDerecho = new Node(elemento);
            }else{
                arbolDerecho.add(elemento);
            }
        }
    }
    
}
