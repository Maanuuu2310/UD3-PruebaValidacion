package com.concesionario.camion;
import com.concesionario.Vehiculo;

public class Camion extends Vehiculo {
    private int capacidadCarga;
    public Camion(String marca, float peso, double potencia, int numPuertas, float velocidad, int capacidadCarga) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public static void acelerar() {
        velocidad += 5;
    }

    @Override
    public String toString() {
        String salida = "Tipo de vehiculo: Camion";
        salida += "\n\t Marca: " + getMarca();
        salida += "\n\t Peso: " + getPeso() + "kg";
        salida += "\n\t Potencia: " + getPotencia() + "kW";
        salida += "\n\t Número de puertas: " + getNumPuertas();
        salida += "\n\t Capacidad de carga: " + getCapacidadCarga();
        salida += "\n\t Velocidad actual: " + getVelocidad() + "km/h";

        return salida;
    }
}
