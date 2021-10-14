package variablesDatosOperaciones.EjerciciosBoolean;
/*
Ejercicio 1: Si X, Y y Z son variables de tipo boolean con valores X = true, Y = false, Z = true, determina el valor de las siguientes expresiones lógicas:
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        boolean X = true;
        boolean Y = false;
        boolean Z = true;

        System.out.println("a) (X && Y) || (X && Z) ");
        System.out.println((X && Y) || (X && Z));
    }
}
