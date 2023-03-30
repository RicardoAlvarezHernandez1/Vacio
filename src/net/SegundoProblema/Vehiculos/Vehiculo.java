package net.SegundoProblema.Vehiculos;

public class Vehiculo {

    protected String marca;
    protected float peso;
    protected int potencia;
    protected int numeroPuertas;
    protected int velocidad;

    public Vehiculo(String marca, float peso, int potencia, int numeroPuertas, int velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numeroPuertas = numeroPuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad += 10;
    }



}
