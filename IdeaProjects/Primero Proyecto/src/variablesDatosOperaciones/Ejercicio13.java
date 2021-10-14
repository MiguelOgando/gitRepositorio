package variablesDatosOperaciones;

import java.util.Scanner;

/*
13. Escribe un programa que, dado un importe en euros, indique el número mínimo de
billetes y la cantidad sobrente que se pueden utilizar para obtener dicha cantidad.
Por ejemplo:

232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.
 */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad = sc.nextInt();

        System.out.println("Cantidad de euros: ");
        int b500 = cantidad / 500;
        int resto = cantidad % 500;
        System.out.println("Cantidad de billetes de 500: " + b500);

        int b200 = resto / 200;
        resto = resto % 200;
        System.out.println("Cantidad de billetes de 200: " + b200);

        int b100 = resto / 100;
        resto = resto % 100;
        System.out.println("Cantidad de billetes de 100: " + b100);

        int b50 = resto / 50;
        resto = resto % 50;
        System.out.println("Cantidad de billetes de 50: " + b50);

        int b20 = resto / 20;
        resto = resto % 20;
        System.out.println("Cantidad de billetes de 20: " + b20);

        int b10 = resto / 10;
        resto = resto % 10;
        System.out.println("Cantidad de billetes de 10: " + b10);

        int b5 = resto / 5;
        resto = resto % 5;
        System.out.println("Cantidad de billetes de 5: " + b5);

        int mon2 = resto / 2;
        resto = resto % 5;
        System.out.println("Cantidad de monedas de 2: " + mon2);

        int mon1 = resto / 1;
        resto = resto % 5;
        System.out.println("Cantidad de monedas de 1: " + mon1);








    }
}
