package EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        String usuarioCorrecto = "user";
        String contraseñaCorrecta = "1234";

        Scanner sc = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = sc.next();

        System.out.println("Contraseña: ");
        String pass = sc.next();

        if (usuario.equals(usuarioCorrecto) && pass.equals(contraseñaCorrecta)) {
            System.out.println("Has entrado en el sistema");
        }else {
            System.out.println("Usuario incorrecto");

        }
    }
}