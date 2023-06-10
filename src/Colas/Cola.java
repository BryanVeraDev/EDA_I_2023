/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;

/**
 *
 * @author DANIELA
 */
public class Cola<A> {
    private Node <A> inicio;
    private Node<A> fin;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    
    public void encolar(A dato){
        Node n = new Node(dato, null);
        if(esVacia()){
            inicio = n;
            fin = n;
        }
        else{
            fin.setSiguiente(n);
            fin = n;
        }
        size++;
    }

    public boolean esVacia(){
        return inicio == null;
    }
    
    public A desencolar(){
        if(!esVacia()){
            A dato = inicio.getDato();
            inicio = inicio.getSiguiente();
            size--;
            return dato;
        }
        return null;
    }
    
    public void imprimir(){
        Node aux = inicio;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
    /**
     * @return the inicio
     */
    public Node <A> getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(Node <A> inicio) {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public Node<A> getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(Node<A> fin) {
        this.fin = fin;
    }
}
