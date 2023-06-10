/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ListaD;

import Utilidades.Estructura;

/**
 *
 * @author estudiante
 * 
 */
public class ListaDoble<A> implements Estructura<A> {

    Node<A> inicio;
    Node<A> ultimo;


    public Node<A> getInicio() {
        return inicio;
    }

    public void setInicio(Node<A> inicio) {
        this.inicio = inicio;
    }

    public Node<A> getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node<A> ultimo) {
        this.ultimo = ultimo;
    }
    
    @Override
    public void add(Object dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if(inicio == null){
            inicio = nuevo;
            ultimo = nuevo;
        }
        else{
            nuevo.setSiguiente(inicio);
            inicio.setAnterior(nuevo);
            inicio = nuevo;
        }
    }

    @Override
    public void addFinal(Object dato) {
        Node nuevo = new Node();
        nuevo.setDato(dato);
        if(ultimo == null){
        inicio = nuevo;
        ultimo = nuevo;
        }
        else{
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }
    
    public void imprimir(){
        Node aux = inicio;
        while(aux != null){
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    @Override
    public boolean isEmpty() {
       return inicio == null;
    }

    @Override
    public A buscar(A entrada) {
        Node<A> aux = inicio;
        while(aux!= null){
            if(aux.getDato().equals(entrada)) return aux.getDato();
            else aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public A eliminarInicio() {
        Node<A> aux = null;
        if(inicio != null){
            aux = inicio;
            if(ultimo == inicio){
                //ultimo = null;
                //inicio = null;
                inicioIgualFinal();
            }
            else{
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
        }
        return aux.getDato();
    }
    
    public void inicioIgualFinal(){
        ultimo = null;
        inicio = null;
    }

    @Override
    public A eliminarFinal() {
        Node<A> aux = null;
        if(ultimo != null){
            aux = ultimo;
            if(ultimo == inicio){
                //inicio = null;
                //ultimo = null;
                inicioIgualFinal();
            }
            else{
                ultimo = ultimo.getAnterior();
                ultimo.setSiguiente(null);
            }
        }
        return aux.getDato();
        
    }

    @Override
    public A eliminar(A dato) {
        A Objeto = null;
        
        if(isEmpty()!= true){
            if(inicio == ultimo){
                Objeto = dato;
                inicio = null;
                ultimo = null;
            }else{
                if(inicio.getDato() == dato){
                    eliminarInicio();
                }else{
                    if(ultimo.getDato() == dato){
                        eliminarFinal();
                    }else{
                        
                        Node aux = inicio;

                        while(aux != null){    
                            if(aux.getDato() == dato){
                                Objeto = dato; 
                        
                                aux.getAnterior().setSiguiente(aux.getSiguiente());
                                aux.getSiguiente().setAnterior(aux.getAnterior()); 
                                return Objeto;
                            }
                            aux = aux.getSiguiente(); 
                        }
                    }                 
                }             
            }      
        }

        return Objeto;
    }
    
   
}
