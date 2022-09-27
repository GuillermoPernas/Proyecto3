package modelo;

import java.util.GregorianCalendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pernas
 */
public class Cuenta {
    
    private int numCuenta;
    private GregorianCalendar fecha;
    private float saldo;
    private String propietario;
    
    public Cuenta(){
        this.fecha = new GregorianCalendar();
        this.numCuenta = 0;
        this.saldo = 0;
        this.propietario = "";
    }

    public Cuenta(int numCuenta, float saldo, String propietario) {
        this();
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }
    
    public Cuenta(GregorianCalendar fecha) {
        this.fecha = fecha;
        this.numCuenta = 0;
        this.saldo = 0;
        this.propietario = "";
    }
    
    public Cuenta(int numCuenta, float saldo, String propietario, GregorianCalendar fecha) {
        this(fecha);
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numCuenta=" + numCuenta + ", fecha=" + fecha + ", saldo=" + saldo + ", propietario=" + propietario + '}';
    }
    
}
