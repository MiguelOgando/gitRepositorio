package variablesDatosOperaciones;
 /*
 9. Escribe un programa que calcule (y muestre) cuántas horas, minutos y segundos han
transcurrido entre dos momentos del mismo día.
 Para ello, el programa ha de pedir por teclado seis números enteros: las horas, minutos y segundos para el momento
inicial y lo mismo para el momento final.
 De momento vamos a considerar que los números introducidos van a estar en el rango adecuado y que el momento inicial
introducido es menor (o igual) que el momento final.
 Por ejemplo, si se introducen los números 1, 2, 30,15, 21, 1 entenderemos que el momento inicial es 1:02:30 am y
el momento final es 15:21:1. El programa debe mostrar por pantalla la diferencia en
el formato: hh:mm:ss.
  */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner er = new Scanner(System.in);

        System.out.println("Momento inicial:");
        System.out.println("================");

        //primer momento:
        int h1j = sc.nextInt() * 3600;
        int min1j = sc.nextInt() * 60;
        int seg1j = sc.nextInt();

            int h1 = h1j / 3600;
            int min1 = min1j / 60;
            int seg1 = seg1j;

        System.out.println("Introduce la hora:");
        System.out.println(h1);
        System.out.println("Introduce los minutos:");
        System.out.println(min1);
        System.out.println("Introduce los segundos:");
        System.out.println(seg1);
        System.out.println("");

        System.out.println("Momento final:");
        System.out.println("==============");

        int h2j = er.nextInt() * 3600;
        int min2j = er.nextInt() * 60;
        int seg2j= er.nextInt();

            int h2 = h2j / 3600;
            int min2 = min2j / 60;
            int seg2= seg2j;

        System.out.println("Introduce la hora:");
        System.out.println(h2);
        System.out.println("Introduce los minutos:");
        System.out.println(min2);
        System.out.println("Introduce los segundos:");
        System.out.println(seg2);
        System.out.println("");

        System.out.println("Datos introducidos: momento incial:" + h1 + ":" + min1 + ":" + seg1 + "   momento final: " + h2 + ":" + min2 + ":" + seg2);

        int h3 = (h2j - h1j) / 3600;
        int min3 = (min2j - min1j) / 60;
        int seg3 = (seg2j - (-seg1j));

        System.out.println("");

        System.out.println("La diferencia entre ambos momentos es: " + h3 + ":" + min3 + ":" + seg3);








    }
}
