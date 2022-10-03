/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;

/**
 *
 * @author alumno
 */
public class Lista <T>{
    
    private Nodo first;
    private Nodo actual;
    private Nodo last;
    
    public Lista() {
        first = null;
        actual = null;
        last = null;
        
    }
    
    public void crearNodo(T typo) {
        Nodo<T> n = new Nodo<T>(typo);
        
        if(first == null) {
            first = n;
            actual = n;
            last = n;
        } else {
            n.setAnt(last);
            last.setSig(n); 
            last = n;
        }
    }
    
    public void moveForward(){
        //This method move de current pointer to the next node of the list.
        if (actual.getSig() != null)
            setActual(actual.getSig());
    }
    
    public void goBack(){
        //This method move de current pointer to the previous node of the list.
        if (actual.getAnt() != null)
            setActual(actual.getAnt());
    }
    
    public void resetCurrentFirst(){
        //When is required this method move the current pointer to the head list from beginning.
        actual = first;
    }
    
    public void resetCurrentLast(){
        //When is required this method move the current pointer to the last list from ending.
        actual = last;
    }

//    public T getActual() {
//        return actual.getTypo();
//    }

    public Boolean esUltimo() {
        return (actual.getSig() == null);
    }
    
    public Boolean esPrimero() {
        return (actual.getAnt() == null);
    }

    public Nodo getActual() {
        return actual;
    }

    public void setActual(Nodo actual) {
        this.actual = actual;
    }

    public Nodo getFirst() {
        return first;
    }

    public void setFirst(Nodo first) {
        this.first = first;
    }

    public Nodo getLast() {
        return last;
    }

    public void setLast(Nodo last) {
        this.last = last;
    }
    
}
