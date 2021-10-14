package variablesDatosOperaciones;

import java.util.Scanner;

/*
31. Escribe un programa que lea un valor por teclado y verifique si es menor que 10. El
programa debe imprimir un booleano (true o false).
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean valor = num < 10;
        valor = !valor;
        //boolean valor = false;

        System.out.println("The valor that you write was " + valor + ".");
    }
}
