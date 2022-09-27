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
public class Lista {
    
    private Nodo first;
    private Nodo actual;
    private Nodo last;
    
    public Lista() {
        first = null;
        actual = null;
        last = null;
        
    }
    
    public void crearNodo(Object obj) {
        Nodo n = new Nodo(obj);
        
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
        
        actual = actual.getSig();
        if(actual == null)
            actual = last;
    }
    
    public void goBack(){
        //This method move de current pointer to the previous node of the list.
        
        actual = actual.getAnt();
        
        if(actual == null)
            actual = first;
    }
    
    public void resetCurrent(){
        //When is required this method move the current pointer to the head list from beginning.
        actual = first;
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
}
