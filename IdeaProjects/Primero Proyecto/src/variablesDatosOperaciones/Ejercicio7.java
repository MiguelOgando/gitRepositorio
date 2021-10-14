package variablesDatosOperaciones;

import java.util.Scanner;

public class Ejercicio7 {
    /*
7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
minutos.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();

        int hora = min / 60;
        int rest = min % 60;

        System.out.println("En ");
    }



}

