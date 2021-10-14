package variablesDatosOperaciones;

import java.util.Scanner;

/*
24. Realiza un programa que pida el precio de venta de un producto, la cantidad de
productos comprados y el porcentaje de IVA aplicado. El programa mostrará el
importe a abonar.
 */
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double prec = sc.nextDouble();
        System.out.println("MERCADONA");
        System.out.println("=========");
        System.out.println("Pago realizado de: " + prec + "euros");
        double lejia = prec - 1.20;
        prec = prec - 0.80; //macarrones
        double iva = prec * 0.10;


        System.out.println("LEJIA          1x 1.20");
        System.out.println("MACARRONES     1x 0.80;");
        System.out.println("IVA incluido " + iva + "euros");
        System.out.println("=======================");
        System.out.println("Precio TOTAL = " );


    }
}
