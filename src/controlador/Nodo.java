/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author alumno
 */
public class Nodo <T>{
    
    private T typo;
    private Nodo sig;
    private Nodo ant;

    public Nodo(T typo) {
        this.typo = typo;
        this.ant = null;
        this.sig = null;
    }

    public T getTypo() {
        return typo;
    }

    public void setTypo(T typo) {
        this.typo = typo;
    }


    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}
