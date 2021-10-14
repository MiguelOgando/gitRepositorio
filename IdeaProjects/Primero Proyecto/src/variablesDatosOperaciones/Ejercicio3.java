package variablesDatosOperaciones;
/*
3. A partir de una variable num1 con valor inicial 12 y una variable num2 con valor
inicial 4, crear nuevas variables que almacenen el resultado de realizar la suma, resta,
multiplicación, división y resto de num1 y num2. Mostrar el valor de las nuevas
variables por pantalla.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        int div = num1 / num2;
        int rest = num1 % num2;
        System.out.println("Operaciones, se presentan los valores num1 = 12 y num2 = 4:");
        System.out.println("Suma : " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multi);
        System.out.println("División: " + div + " y su resta: " + rest);
    }
}
