import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        System.out.println("Se necesita empleado de cocina.\nRellene este formulario:\n -Nombre   -Edad  -Años de experiencia  -Preferencia de cocina ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Nombre:");
        String name = sc.nextLine();

        System.out.println("Edad:");
        String age = sc.nextLine();

        System.out.println("Años de experiencia:");
        String experience = sc.nextLine();

        System.out.println("Preferencia de cocina:");
        String preference = sc.nextLine();

        System.out.print("El formulario de " + name);
        System.out.print(" de " + age);
        System.out.print(" y " + experience);
        System.out.print(" de experiencia, está completo.\nNos comunicaremos con usted si necesitamos alguien que cocine comida ");
        System.out.println(" " + preference);

    }
}
