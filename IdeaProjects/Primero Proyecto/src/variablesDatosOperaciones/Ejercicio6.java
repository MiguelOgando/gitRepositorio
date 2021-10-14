package variablesDatosOperaciones;
/*
6. N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
cuántas sobrarán tras el reparto.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        int N = 5;
        int K = 28;
        int R = K / N;
        int J = K % N;
        System.out.println("Tras el reparto a cada ardilla le han tocado" + R + " y  han sobrado " + J + " nueces.");

    }
}
