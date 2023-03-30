package net.SegundoProblema;

import net.SegundoProblema.Vehiculos.Camion.Camion;
import net.SegundoProblema.Vehiculos.Ciclomotor.Ciclomotor;

public class SegundoProblema {

    public static void main(String[] args) {

        Camion camioncito = new Camion("Mercedes", 3000.5f, 130 , 2 , 60 , 2500);
        Ciclomotor ciclomotorcito = new Ciclomotor("Mini Motos Adri Nuñez" , 500.00f , 35 , 0 , 20 , "No");

        camioncito.acelerar();
        ciclomotorcito.acelerar();

        System.out.println(camioncito.toString());
        System.out.println(ciclomotorcito.toString());



    }

}
