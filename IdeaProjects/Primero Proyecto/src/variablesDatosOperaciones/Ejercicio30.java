package variablesDatosOperaciones;
/*
30. Di si funcionará el siguiente código; en caso afirmativo, explica qué mostrará por
pantalla. En caso negativo, explica por qué no funciona.
boolean adivina = ((97 == 'a') && true);
System.out.println(adivina);
 */

public class Ejercicio30 {
    public static void main(String[] args) {
        boolean adivina = ((97 == 'a') && true);
        System.out.println(adivina);
        System.out.println("Sí que es afirmativo ya que al hacer las operaciones encontramos que (97 == 'a') si que es TRUE\ny true por el metodo && da true.");
    }
}
