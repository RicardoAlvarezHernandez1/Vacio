package net.PrimerProblema.Calculadoras;

public class Calculadora {
    public static int factorialDeN(int numeroFactorial){

        int resultado = 1;
        if (numeroFactorial == 0 || numeroFactorial < 0){
            System.out.println("Debe introducir un número positivo");
        } else {
            for (int i = 1; i <= numeroFactorial ; i++) {
                resultado = resultado * i;
            }
        }
        return resultado;
    }
    
    public static float mediaHastaN(int numeroDeMedia) {
        float resultado = 0f;
        float media = 0f;
        if (numeroDeMedia == 0 || numeroDeMedia < 0) {
            System.out.println("Debe introducir un número positivo");
        } else {
            for (int i = 0; i <= numeroDeMedia; i++) {
                resultado = resultado + i;
            }
            media = resultado / numeroDeMedia;
        }
        return media;
    }

    public static String obtenerPasosFibonacci(int numeroFibonacci){
        int numero1 = 0 , numero2 = 1 , suma = 1;
        String resultado = "";
        for (int i = 1; i < numeroFibonacci; i++) {
            resultado += ","+ suma;
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        }
        return ("0") + resultado;
    }

}
