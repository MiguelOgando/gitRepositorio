package EstructurasDeControl;

import java.util.Scanner;

/*
2. Realiza un programa que pida por teclado el sueldo anual de una persona, si supera
los 9000 euros, mostrar un mensaje en pantalla indicando que debe abonar
impuestos. Si no lo supera, que indique que no debe abonarlos.
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();
        if (num >= 9000) {
            System.out.println("Usted debe ahorrar impuestos.");
        }
        if (num < 9000) {
            System.out.println("No debe abonar impuestos.");
        }
        System.out.println("Gracias por visita.");
    }
}
