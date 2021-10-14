package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Eres el culpable? (true/false)");
        boolean culpable = sc.hasNextBoolean();
        if (culpable) {
            System.out.println("A la cárcel");
        } else {
            System.out.println("A casa");
        }
    }
}
