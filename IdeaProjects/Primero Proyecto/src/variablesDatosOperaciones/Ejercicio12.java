package variablesDatosOperaciones;

import java.util.Scanner;

/*
12. Escribe un programa que lea un número de tres cifras y muestre el número invertido.
Por ejemplo: si introducimos el número 320, el programa debe mostrar 23; si
introducimos 976, el programa debe mostrar 679.
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int c = num / 100;
        int resto = num % 100;
        int d = resto / 10;
        int u = resto % 10;

        int inv = u * 100 + d * 10 + c;
        System.out.println("Invertido: " + inv);




    }
}
