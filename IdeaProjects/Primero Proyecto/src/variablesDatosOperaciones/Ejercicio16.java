package variablesDatosOperaciones;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cuadr = sc.nextInt();

        System.out.println("¿Cuál es el lado de un cuadraro 'x' y el perímetro del msimo?");
        double lado = cuadr;
        double per = cuadr * cuadr;

        System.out.println("El lado del cuadrado son " + lado + "cm, y su perímetro es " + per + "cm");
    }
}
