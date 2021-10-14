package variablesDatosOperaciones;

import java.util.Scanner;

/*
33. Escribe un programa que lea tres números enteros e imprima true si el primer
número está entre el segundo y el tercero (ambos inclusive). De lo contrario, debe
imprimir false.
 */
public class Ejercicio33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        boolean adivina = (num2 < num1) && (num1<num3);


    }
}
