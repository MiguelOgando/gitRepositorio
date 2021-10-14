package EstructurasDeControl;

import java.util.Scanner;

/*
1. Escribe un programa que pida un número e indique si es par o impar (un número es
par si al dividirlo entre 2 el resto es 0).
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba cualquier número para saber si es par o impar: ");
        int num = sc.nextInt();
        int rest = num % 2;
        if (rest == 0) {
            System.out.println("Este número es par.");

        }
        if ((rest < 0) || (0 < rest)) {
            System.out.println("Este número es impar.");
        }
    }
}
