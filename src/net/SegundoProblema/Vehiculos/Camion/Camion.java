package net.SegundoProblema.Vehiculos.Camion;

import net.SegundoProblema.Vehiculos.Vehiculo;

public class Camion extends Vehiculo {



        private float capacidad;

        public Camion(String marca, float peso, int potencia, int numeroPuertas, int velocidad , float capacidad) {
            super(marca, peso, potencia, numeroPuertas, velocidad);
            this.capacidad = capacidad;
        }

        @Override
        public void acelerar(){
            velocidad += 5;
        }

        @Override
        public String toString(){

            String msg = ("Tipo de vehículo: Camión." + "\n");
            msg += ("Marca : " + this.marca + "\n");
            msg += ("Peso : " + this.peso + "\n");
            msg += ("Potencia : " + this.potencia + "\n");
            msg += ("Número de puertas : " + this.numeroPuertas + "\n");
            msg += ("Capacidad de carga : " + this.capacidad + "\n");
            msg += ("Velocidad actual : " + this.velocidad + "\n");

            return msg;
        }

}
