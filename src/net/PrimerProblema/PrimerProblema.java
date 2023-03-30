package net.PrimerProblema;

import net.PrimerProblema.Calculadoras.Calculadora;

import java.util.Scanner;

public class PrimerProblema {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un valor numérico positivo : ");
        int valorNumerico = teclado.nextInt();

        if(valorNumerico == 0 || valorNumerico < 0){
            System.out.println("Debe introducir un valor numérico positivo o mayor que 0.");
        } else {
            System.out.println("El factorial de " + valorNumerico + " es : " + Calculadora.factorialDeN(valorNumerico));
            System.out.println("La media de los numeros comprendidos entre 1 y " + valorNumerico + " es igual a : " + Calculadora.mediaHastaN(valorNumerico));
            System.out.println("Los primeros números de la sucesión de Fibonacci : " + Calculadora.obtenerPasosFibonacci(valorNumerico));
        }







    }
}