package variablesDatosOperaciones;

import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota parcial 1: ");
        double p1 = sc.nextDouble();
        System.out.println("Nota parcial 2: ");
        double p2 = sc.nextDouble();
        System.out.println("Nota parccial 3: ");
        double p3 = sc.nextDouble();
        double mediaparciales = (p1 + p2 + p3);
        double proporcionparciales = mediaparciales * 55 / 100;

        System.out.println("Nota examen final: ");
        double ef = sc.nextDouble();
        double proporcionef = ef * 55 / 100;

        System.out.println("Nota examen final: ");
        double tf = sc.nextDouble();
        double proporciontf = tf * 55 / 100;

        double notafinal = proporcionparciales + proporcionef + proporciontf;
        System.out.println("Nota final: " + notafinal);
        }

    }

