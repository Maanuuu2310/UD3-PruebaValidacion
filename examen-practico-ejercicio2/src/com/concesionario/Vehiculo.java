package com.concesionario;
public class Vehiculo {

    // ATRIBUTOS //

    private String marca;
    private float peso;
    private double potencia;
    private int numPuertas;
    protected float velocidad;

    // CONSTRUCTOR //

    public Vehiculo(String marca, float peso, double potencia, int numPuertas, float velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numPuertas = numPuertas;
        this.velocidad = velocidad;
    }

    // GETTERS Y SETTERS UwU

    public String getMarca() {
        return marca;
    }

    public float getPeso() {
        return peso;
    }

    public double getPotencia() {
        return potencia;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public float getVelocidad() {
        return velocidad;
    }

    // METODO PARA ACELERAR OwO

    public void acelerar() {
        velocidad += 10;
    }
}
