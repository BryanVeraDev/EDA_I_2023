package lista_s;

import Utilidades.Estructura;

public class SimpleList<A> implements Estructura <A>
{
   Node inicio;
   Node ultimo;

    @Override
    public void add(A dato ) {
        Node n = new Node();
        n.setDato(dato);
        if(inicio == null){
            inicio = n;
            ultimo = n;
        }
        else{
            n.setSiguiente(inicio);
            inicio = n;
        }
    }

    @Override
    public void addFinal(A dato) {
        Node n = new Node();
        n.setDato(dato);
        if(inicio == null){
            inicio = n;
            ultimo = n;
        }
        else{
            ultimo.setSiguiente(n);
            ultimo = n;
        }
        /*n Manera 1 (consume más tiempo)
        else{
            Node indice = inicio;
            while(indice.getSiguiente() != null){
                indice = indice.getSiguiente();
            }
            indice.setSiguiente(n);
        }*/
    }
    
    public void imprimir(){
        Node aux = inicio;
        while(aux != null){
            System.out.println("El dato es " + aux.getDato());
            aux = aux.getSiguiente();
        }
    }

    @Override
    public boolean isEmpty() {
        return inicio == null;
    }

    @Override
    public A buscar(Object entrada) {
        String n = (String) entrada;
        Node aux = inicio;
        while(aux!= null){
            if(aux.getDato().equals(n)) return  (A) aux.getDato();
            else aux = aux.getSiguiente();
        }
        return null;
    }

    @Override
    public A eliminarInicio() {
        Node aux = inicio;
        if(inicio != null){
            if(inicio == ultimo){
                inicio = null;
                ultimo = null;
            }
            else{
                inicio = inicio.getSiguiente();
            }
            return (A) aux.getDato();
        }
        return null;
    }

    @Override
    public A eliminarFinal() {
        Node aux = inicio;
        Node r = ultimo;
        if(inicio != null){
            if(inicio == ultimo){
            inicio = null;
            ultimo = null;
            }
            else{
                while(aux.getSiguiente().getSiguiente() != null){
                    aux = aux.getSiguiente();
                }
                aux.setSiguiente(null);
                ultimo = aux.getSiguiente();
            }
        }
        return (A) r.getDato();
    }

    @Override
    public A eliminar(A dato) {
        if(inicio != null){
            Node aux = inicio;
            Node anterior = inicio;
            while(aux != null){
                if(aux.getDato().equals(dato)) {
                    if(aux == inicio){
                        inicio = aux.getSiguiente();
                    }
                    else{
                        anterior.setSiguiente(aux.getSiguiente());
                    }
                    return (A)aux.getDato();
                }
                else {
                    anterior = aux;
                    aux = aux.getSiguiente();
                }
            }
        }
        return null;
    }
   
   
}
