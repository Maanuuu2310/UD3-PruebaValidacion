package com.concesionario.moto;
import com.concesionario.Vehiculo;

public class Ciclomotor extends Vehiculo {

    private String habilitadoAutopista;

    public Ciclomotor(String marca, float peso, double potencia, int numPuertas, float velocidad, String habilitadoAutopista) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.habilitadoAutopista = habilitadoAutopista;
    }

    public String getHabilitadoAutopista() {
        return habilitadoAutopista;
    }

    public void setHabilitadoAutopista(String habilitadoAutopista) {
        this.habilitadoAutopista = habilitadoAutopista;
    }

    @Override
    public static void acelerar() {
        velocidad += 7;
    }

    @Override
    public String toString() {
        String salida = "Tipo de vehiculo: Ciclomotor";
        salida += "\n\t Marca: " + getMarca();
        salida += "\n\t Peso: " + getPeso() + "kg";
        salida += "\n\t Potencia: " + getPotencia() + "kW";
        salida += "\n\t Número de puertas: " + getNumPuertas();
        salida += "\n\t Puede ir por la autopista: " + getHabilitadoAutopista();
        salida += "\n\t Velocidad actual: " + getVelocidad() + "km/h";

        return salida;
    }


}






