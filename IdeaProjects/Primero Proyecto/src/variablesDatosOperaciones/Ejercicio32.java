package variablesDatosOperaciones;

import java.util.Scanner;

/*
32. Escribe un programa que lea un valor entero y verifique si es menor que 10 y mayor
que 0. El programa debe imprimir un booleano (true o false).
 */
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean adivina = (0 < num)&&(num < 10);
        System.out.println(adivina);


    }
}
