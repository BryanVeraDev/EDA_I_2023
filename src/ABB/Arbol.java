/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABB;

import ListaD.ListaDoble;

/**
 *
 * @author Estudiante
 */
public class Arbol<A> {
    
    private Node<A> raiz;

    /**
     * @return the raiz
     */
    public Node<A> getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Node<A> raiz) {
        this.raiz = raiz;
    }
    
    
    public void insertar(Integer elemento){     
       if(raiz == null){
           raiz = new Node(elemento);
       }else{
           raiz.add(elemento);  
       }
    }

    
    public void recorrerInOrden(Node<A> raiz){
        if (raiz != null){
            recorrerInOrden(raiz.getArbolIzquierdo());
            System.out.println("dato: " + raiz.getDato());
            recorrerInOrden(raiz.getArbolDerecho());
        }else{
            return;
        }
    }

    
    public void recorrerPreOrden(Node<A> raiz){
        if (raiz != null){  
            System.out.println("dato: " + raiz.getDato());
            recorrerPreOrden(raiz.getArbolIzquierdo());
            recorrerPreOrden(raiz.getArbolDerecho());   
        }else{
            return;
        }
    }
    
    public void recorrerPostOrden(Node<A> raiz){
        if (raiz != null){  
            recorrerPostOrden(raiz.getArbolIzquierdo());
            recorrerPostOrden(raiz.getArbolDerecho());
            System.out.println("dato: " + raiz.getDato());
        }else{
            return;
        }
    }
    
    public int contarHojas(Node nodo){
         if(nodo != null){
            if(nodo.getArbolIzquierdo()== null && nodo.getArbolDerecho()== null)
                return 1;
         } else 
            return 0;
         
        int cantidadNodoIzd = contarHojas(nodo.getArbolIzquierdo());
        int cantidadNodoDer = contarHojas(nodo.getArbolDerecho());
        
        return cantidadNodoIzd + cantidadNodoDer;
    }
    
    public int contarNodos(Node nodo){
        if(nodo != null) 
             return 1+ contarNodos(nodo.getArbolIzquierdo())+ contarNodos(nodo.getArbolDerecho());
        else 
             return 0;
    }
     
    public Node eliminarNodoRec(Node<Integer> raiz, int valor) {
        if (raiz == null)
            return raiz;

        if (valor < raiz.getDato())
            raiz.setArbolIzquierdo(eliminarNodoRec(raiz.getArbolIzquierdo(), valor));
        else if (valor > raiz.getDato())
            raiz.setArbolDerecho(eliminarNodoRec(raiz.getArbolDerecho(), valor));
        else {
            if (raiz.getArbolIzquierdo() == null)
                return raiz.getArbolDerecho();
            else if (raiz.getArbolDerecho() == null)
                return raiz.getArbolIzquierdo();

            raiz.setDato(encontrarMinimo(raiz.getArbolDerecho()));
            raiz.setArbolDerecho(eliminarNodoRec(raiz.getArbolDerecho(), (Integer)raiz.getDato()));
        }

        return raiz;
    }

    // Retorna la distancia entre los nodos con valor v1 y v2
    public int distanciaEntreNodos(int v1, int v2) {
        Node ancestroComun = buscarAncestroComun(raiz, v1, v2);
        int distancia1 = distanciaEntreNodoYValor(ancestroComun, v1);
        int distancia2 = distanciaEntreNodoYValor(ancestroComun, v2);
        return distancia1 + distancia2;
    }
    
    // Retorna el nodo que es el ancestro común más cercano a los nodos con valor v1 y v2
    public Node buscarAncestroComun(Node nodo, int v1, int v2) {
        if (nodo == null) {
            return null;
        }
        
        if ((Integer)nodo.getDato() == v1 || (Integer)nodo.getDato() == v2) {
            return nodo;
        }

        Node izq = buscarAncestroComun(nodo.getArbolIzquierdo(), v1, v2);   
        Node der = buscarAncestroComun(nodo.getArbolDerecho(), v1, v2);

        
        if (izq != null && der != null) {
            return nodo;
        } else if (izq != null) {
            return izq;
        } else {
            return der;
        }
    }
    
    // Retorna la distancia entre un nodo y un valor de nodo dado
    public int distanciaEntreNodoYValor(Node nodo, int valor) {
        if (nodo == null) {
            return -1;
        }
        
        int distancia = -1;
        
        if (((Integer)nodo.getDato()== valor) || 
           ((distancia = distanciaEntreNodoYValor(nodo.getArbolIzquierdo(), valor)) >= 0) || 
           ((distancia = distanciaEntreNodoYValor(nodo.getArbolDerecho(), valor)) >= 0)) {
            distancia++;
        }
        
        return distancia;
    }
    
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
        
        System.out.println("Raiz: " + raiz.getDato());

        // Convertir el subárbol izquierdo y obtener la lista resultante
        System.out.println("IZQ");
        ListaDoble<Integer> listaIzquierda = transformacionArbolAListaDoble(raiz.getArbolIzquierdo());
        System.out.println("LISTA IZQ: ");
        listaIzquierda.imprimir();
        System.out.println("ACABO Recursivisdad IZQ");

        // Insertar los elementos de la lista del subárbol izquierdo en la lista principal
        ListaD.Node<Integer> nodoActual = listaIzquierda.getInicio();
        while (nodoActual != null) {  
            System.out.println("Nodo: " + nodoActual.getDato());
            tmp.addFinal(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }

        System.out.println("RAIZ DESPUES IZQ: " + raiz.getDato());
        // Insertar el nodo actual en la lista principal
        tmp.addFinal(raiz.getDato());

        // Convertir el subárbol derecho y obtener la lista resultante
        System.out.println("DER");
        ListaDoble<Integer> listaDerecha = transformacionArbolAListaDoble(raiz.getArbolDerecho());
        System.out.println("LISTA DER: ");
        listaDerecha.imprimir();
        System.out.println("ACABO Recursivisdad DER");

        // Insertar los elementos de la lista del subárbol derecho en la lista principal
        nodoActual = listaDerecha.getInicio();
        while (nodoActual != null) {
            tmp.addFinal(nodoActual.getDato());
            nodoActual = nodoActual.getSiguiente();
        }
        

        return tmp;
    }
    
    public Arbol transformacionListaDobleAArbol(ListaDoble lista){
        Arbol<Integer> aux = new Arbol();
        ListaD.Node<Integer> tmp = lista.getInicio();

        if(tmp == null) {
            return aux;
        }
        
        while(tmp != null){
            aux.insertar(tmp.getDato());
            tmp = tmp.getSiguiente();
        }
        
        return aux;
    }
    
    
    
    
    
    
}
