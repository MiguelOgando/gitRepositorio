package variablesDatosOperaciones;
/*
8. Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
son 3 horas, 30 minutos y 10 segundos.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int segundos = sc.nextInt();
        int horas = segundos / 3600;
        int seg = segundos % 3600;
        int minutos = seg / 60;
        int resto = minutos % 60;

        System.out.println(segundos + " segundos son " + horas + " horas y " + minutos + " minutos " + resto + " y segundos.");



    }
}
