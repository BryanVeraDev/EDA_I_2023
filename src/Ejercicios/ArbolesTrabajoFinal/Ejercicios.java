/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios.ArbolesTrabajoFinal;

import ABB.Arbol;
import ABB.Node;
import ListaD.ListaDoble;

/**
 *
 * @author BRYAN VERA
 */
public class Ejercicios {
    
    // Retorna el valor del nodo minimo
    public int encontrarMinimo(Node<Integer> raiz) {
        int minimo = raiz.getDato();
        while (raiz.getArbolIzquierdo()!= null) {
            minimo = (int) raiz.getArbolIzquierdo().getDato();
            raiz = raiz.getArbolIzquierdo();
        }
        return minimo;
    }
    
    // Retorna el valor del nodo maximo
    public int encontrarMaximo(Node<Integer> raiz) {
        int maximo = raiz.getDato();
        while (raiz.getArbolDerecho()!= null) {
            maximo = (int) raiz.getArbolDerecho().getDato();
            raiz = raiz.getArbolDerecho();
        }
        return maximo;
    }
    
    // Retorna un Int con la altura del árbol
    public int encontrarAltura(Node<Integer> raiz) {
        
        if(raiz != null){
            return 1 + Math.max(encontrarAltura(raiz.getArbolIzquierdo()), encontrarAltura(raiz.getArbolDerecho()));
         } else 
            return 0;
    }
    
    //Retorna true si el arbol está balanceado, false si no lo está
    public boolean isBalanced(Node<Integer> raiz){
        if(raiz == null){
            return false;
        }else{
            int alturaDerecha = encontrarAltura(raiz.getArbolDerecho());
            int alturaizquierdo = encontrarAltura(raiz.getArbolIzquierdo());
            int diferencia = Math.abs(alturaDerecha - alturaizquierdo);
            if(diferencia > 1){
                return false;
            }
           
        }
        
        return true;
        
    }
    
    // Retorna el nodo que es el ancestro común más cercano
    public Node buscarAntecesor(Node raiz, Node nodo) {
        
        Node<Integer> antecesor = null;
        
        if(raiz.getDato() == nodo.getDato()){
            return raiz;
        }
        
        while(raiz != null){
            if(raiz.getDato() == nodo.getDato()){
                return antecesor;
            }else{
                if((Integer)raiz.getDato() > (Integer)nodo.getDato()){
                    antecesor = raiz;
                    raiz = raiz.getArbolIzquierdo();
                
                }else{
                    if((Integer)raiz.getDato() < (Integer)nodo.getDato()){
                        antecesor = raiz;
                        raiz = raiz.getArbolDerecho();
                    }
                }
            } 
        }
       
        return null;

    }
    
    //Retorna una lista doble enlazada con los valores ordenador del arbol
    
    public ListaDoble transformacionArbolAListaDoble(Node raiz){
        ListaDoble<Integer> tmp = new ListaDoble<>();

        if (raiz == null) {
            return tmp;
        }
        

        
        ListaDoble<Integer> listaIzquierda = transformacionArbolAListaDoble(raiz.getArbolIzquierdo());
        listaIzquierda.imprimir();

        
        ListaD.Node<Integer> nodoActual = listaIzquierda.getInicio();
        while (nodoActual != null) {  
            tmp.addFinal(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        
        tmp.addFinal(raiz.getDato());

        ListaDoble<Integer> listaDerecha = transformacionArbolAListaDoble(raiz.getArbolDerecho());
        listaDerecha.imprimir();

        
        nodoActual = listaDerecha.getInicio();
        while (nodoActual != null) {
            tmp.addFinal(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        

        return tmp;
    }
    
    public Arbol transformacionListaDobleAArbol(ListaDoble lista){
        Arbol<Integer> aux = new Arbol();
        ListaDoble<Integer> listaAux = obtenerListaMediana(lista);
        ListaD.Node<Integer> tmp = listaAux.getInicio();

        if(tmp == null) {
            return aux;
        }
        
        while(tmp != null){
            aux.insertar(tmp.getDato());
            tmp = tmp.getSiguiente();
        }
        
        return aux;
    }
    
    
    public ListaDoble<Integer> obtenerListaMediana(ListaDoble lista){
        ListaDoble<Integer> listaAux = ordenarLista(lista);
        ListaDoble<Integer> listaMediana = new ListaDoble<>();
        
        while(listaAux.getSize() > 0){
  
            int size = listaAux.getSize();
            int posicionMediana = 0;
        
            if(size % 2 != 0){     
                posicionMediana = (size + 1) / 2; 

            }else{
                posicionMediana = size / 2;  
            }

        
            ListaD.Node<Integer> tmp = listaAux.getInicio();
            boolean encontro = false;
            
            while(posicionMediana >= 0){ 
                posicionMediana--;
                if(posicionMediana == 0){
                    listaAux.eliminar(tmp.getDato());
                    listaMediana.addFinal(tmp.getDato()); 
                    encontro = true;
                } 
                tmp = tmp.getSiguiente();
            }    
        }
        
         int datoFinal = (Integer)listaAux.getInicio().getDato();
         listaMediana.addFinal(datoFinal);
        

        return listaMediana;    
    }
    
    public ListaDoble<Integer> ordenarLista(ListaDoble lista){
        ListaDoble<Integer> listaAux = lista;
        ListaD.Node<Integer> tmp = listaAux.getInicio();
        
        if (tmp == null || tmp.getSiguiente() == null) {
            return lista;
        }

        boolean swapped;
        do {
            swapped = false;
            ListaD.Node<Integer> current = tmp;
            while (current.getSiguiente() != null) {
                if (current.getDato() > (Integer)current.getSiguiente().getDato()) {
                    swapNodes(current, current.getSiguiente());
                    swapped = true;
                }
                current = current.getSiguiente();
            }
        } while (swapped);
        
        return listaAux; 
    }
    
    public void swapNodes(ListaD.Node node1, ListaD.Node node2) {
        int temp = (Integer)node1.getDato();
        node1.setDato((Integer)node2.getDato());
        node2.setDato(temp);
    }
    
}
