package variablesDatosOperaciones;

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();
        double num4 = sc.nextDouble();
        double num5 = sc.nextDouble();
        double num6 = sc.nextDouble();


        double suma = num1 + num2 + num3 + num4 + num5 + num6;
        double media = suma / 6;
        System.out.println("Media nota final-->");
        System.out.println("Suma: " + suma);
        System.out.printf("%.0f", media);}
}
