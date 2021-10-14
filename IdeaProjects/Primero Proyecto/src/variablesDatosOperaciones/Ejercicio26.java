package variablesDatosOperaciones;

import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("Sueldo base: ");
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        System.out.println("Importe venta 1: ");
        double venta1 = sc.nextDouble();
        System.out.println("Importe venta 2: ");
        double venta2 = sc.nextDouble();
        System.out.println("Importe venta 3: ");
        double venta3 = sc.nextDouble();

        double ventas = venta1 + venta2 + venta3;
        double comision = ventas + 10 / 100;
        double sueldo = base + comision;

        System.out.println("Comisión: " + comision);
        System.out.println("Sueldo total: " + sueldo);
    }
}
