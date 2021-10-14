package EstructurasDeControl;

import java.util.Scanner;

/*
3. Escribe un programa que pida dos números e indique si el primero es mayor que el
segundo o no.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escriba dos numeros por el amor de dios. :)");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num2 < num1) {
            System.out.println("Este numero es mayor gracias al señor.");
        }
        if (num1 < num2) {
            System.out.println("Por qué tuvo que ser menor, por qué y-y");
        }
    }
}
