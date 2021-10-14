package variablesDatosOperaciones;

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n: ");
        double n = sc.nextDouble();
        System.out.println("p");
        double p = sc.nextDouble();

        double porc = n * p / 100;
        System.out.println("El " + p + "% de " + n + " es " + porc);

        System.out.println("a) " + (n + porc));
        System.out.println("b) " + (n - porc));
        }
/*
        double cero = por1 * 0;
        double diez = por1 * 0.1;
        double veint = por1 * 0.2;
        double trein = por1 * 0.3;
        double cuar= por1 * 0.4;
        double cinc = por1 * 0.5;
        double sesent = por1 * 0.6;
        double setenn = por1 * 0.7;
        double ochen = por1 * 0.8;
        double noven = por1 * 0.9;
        double cien = por1 * 1;

        System.out.println("Incrementando el porcentaje del primer valor " + por1);

 */


    }

