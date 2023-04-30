/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ccuenta;

import java.util.List;

/**
 *
 * @author ED05
 */
public class CCuenta {

    // Propiedades de la Clase Cuenta
    /**
     * Nombre del titular de la cuenta.
     */
    private String nombre;
     /**
     * Número de cuenta de la cuenta.
     */
    private String cuenta;
     /**
     * Saldo actual de la cuenta.
     */
    private double saldo;
     /**
     * Tipo de interés de la cuenta.
     */
    private double tipoInterés;
     /**
     * Facturas asociadas a la cuenta.
     */
    private String[] factura = {"seguro", "luz", "agua", "alquiler"};


    /* Constructor sin argumentos */
    /**
     * Constructor vacío de la clase CCuenta.
     */
    public CCuenta() {
    }

    // Constructor con parámetro para iniciar todas las propiedades de la clase
     /**
     * Constructor de la clase CCuenta que permite inicializar todas las propiedades de la cuenta.
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta de la cuenta.
     * @param sal Saldo inicial de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
        this.tipoInterés = tipo;
    }
    // Método para asignar el nombre del titular de la cuenta
    
    /**
     * Método para asignar el nombre del titular de la cuenta.
     * @param nom Nombre del titular de la cuenta.
     */
    public void setNombre(String nom) {
        this.nombre = nom;
    }
    
    /**
     * Método que devuelve el nombre del titular de la cuenta.
     * @return Nombre del titular de la cuenta.
     */

    // Método que me devuelve el nombre del titular
    public String getNombre() {
        return this.nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento
    /**
     * Método que devuelve el saldo disponible en cada momento en la cuenta.
     * @return Saldo actual de la cuenta.
     */
    public double getEstado() {
        return this.saldo;
    }

    /**
     * Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad Cantidad a ingresar en la cuenta.
     * @throws Exception Si se intenta ingresar una cantidad negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = this.saldo + cantidad;
    }

    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */
    /**
     * Método para retirar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad Cantidad a retirar de la cuenta.
     * @throws Exception Si se intenta retirar una cantidad negativa o mayor al saldo actual.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getEstado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        this.saldo = saldo - cantidad;
    }

    // Método que me devuelve el número de cuenta
     /**
     * Método que devuelve el número de cuenta de la cuenta.
     * @return Número de cuenta de la cuenta.
     */
    public String getCuenta() {
        return this.cuenta;
    }
    /**
     * Método que cobra una factura de la cuenta.
     * @param tipo Tipo de factura a cobrar.
     * @param cantidad Cantidad de la factura a cobrar.
     */

    public void cobroFactura(String tipo,double cantidad){
        switch(tipo){
        
            case "alquiler":
                if (cantidad >0 && cantidad<=400)
                    this.saldo -=cantidad; //this.saldo = this.saldo-cantidad;
                break;
            case "luz":
                if (cantidad<=200)
                    this.saldo -=cantidad;
            case "agua":
                
                if (cantidad >0 && cantidad<=200)
                    this.saldo -=cantidad;
                break;
            case "seguro":
                if (cantidad >0 && cantidad<=125)
                    this.saldo -=cantidad;
                    
                
        }
    
    }
    
    
}
    
 