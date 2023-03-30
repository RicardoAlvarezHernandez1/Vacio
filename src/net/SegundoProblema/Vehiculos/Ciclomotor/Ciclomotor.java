package net.SegundoProblema.Vehiculos.Ciclomotor;

import net.SegundoProblema.Vehiculos.Vehiculo;

public class Ciclomotor extends Vehiculo {

    private String estadoHabilitado;

    public Ciclomotor(String marca, float peso, int potencia, int numeroPuertas, int velocidad , String estadoHabilitado) {
        super(marca, peso, potencia, numeroPuertas, velocidad);
        this.estadoHabilitado = estadoHabilitado;
    }

    @Override
    public void acelerar(){
        velocidad += 7;
    }

    @Override
    public String toString(){

        String msg = ("Tipo de vehículo: Ciclomotor" + "\n");
        msg += ("Marca : " + this.marca + "\n");
        msg += ("Peso : " + this.peso + "\n");
        msg += ("Potencia : " + this.potencia + "\n");
        msg += ("Número de puertas : " + this.numeroPuertas + "\n");
        msg += ("Puede ir por autopista: " + this.estadoHabilitado + "\n");
        msg += ("Velocidad actual : " + this.velocidad + "\n");

        return msg;
    }


}
