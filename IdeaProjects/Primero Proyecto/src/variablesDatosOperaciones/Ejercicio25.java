package variablesDatosOperaciones;

import java.util.Scanner;

/*
25. Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente
desea saber cuanto deberá pagar finalmente por su compra.
 */
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compra = sc.nextDouble();
        System.out.println("Importe de la compra: ");
        double descuento = compra * 15 / 100;
    }
    }

