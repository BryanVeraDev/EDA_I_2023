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
 * @author Bryan Vera
 */
public class Test {
    public static void main(String[] args) {
        Arbol a = new Arbol();
        a.insertar(10);
        a.insertar(5);
        a.insertar(15);
        a.insertar(3);
        a.insertar(7);
        a.insertar(6);
        a.insertar(1);
        a.insertar(4);
        a.insertar(8);
        a.insertar(9);
        

        //a.recorrerPreOrden(a.getRaiz());
        //a.recorrerInOrden(a.getRaiz());
        //a.recorrerPostOrden(a.getRaiz());
        
        
        //System.out.println("La distancia entre los nodos 1 y 4 es: " + a.distanciaEntreNodos(1, 4));
        
        System.out.println("\t" + "Actividad Arboles");
        
        //Encontrar minimo
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "\u001B[34m" + "Minimo de un Arbol");
        System.out.println("Altura: " + a.encontrarMinimo(a.getRaiz()));
        
        //Encontrar maximo
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "Maximo de un Arbol");
        System.out.println("Altura: " + a.encontrarMaximo(a.getRaiz()));

        //Altura de un Arbol
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "Altura de un Arbol");
        System.out.println("Altura: " + a.encontrarAltura(a.getRaiz()));
       
        //Arbol Balanceado
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "Arbol Balanceado");
        System.out.println("Is Balanced: " + a.isBalanced(a.getRaiz()));
        
        //Antecesor de un Nodo
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "Antecesor de un Nodo");
        Node<Integer> aux = a.getRaiz();
        aux = aux.getArbolIzquierdo().getArbolIzquierdo();
        System.out.println("Nodo a buscar su antecesor: " + aux.getDato());
        System.out.println("Antecesor: " + a.buscarAntecesor(a.getRaiz(), aux).getDato());
        
        //Pasar ABB a Lista Doble
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "ABB a ListaDoble");
        ListaDoble<Integer> tmp = new ListaDoble<>();
        tmp = a.transformacionArbolAListaDoble(a.getRaiz());
        tmp.imprimir();
        
        //Pasar Lista Doble a ABB
        System.out.println("----||----||----||----||----||----||----");
        System.out.println("\u001B[1m" + "ListaDoble a ABB");
        ListaDoble<Integer> tmp2 = new ListaDoble<>();
        Arbol<Integer> a2 = new Arbol<>();
        tmp2.addFinal(5);
        tmp2.addFinal(4);
        tmp2.addFinal(3);
        tmp2.addFinal(2);
        tmp2.addFinal(1);
        tmp2.addFinal(6);
        tmp2.addFinal(7);
        tmp2.addFinal(8);
        tmp2.addFinal(9);
        
        a2 = a2.transformacionListaDobleAArbol(tmp2);
        a2.recorrerPostOrden(a2.getRaiz());
        
        
    }
    
}
