package Main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class excepcionej5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean numeroValido = false;

        while (!numeroValido) {
            System.out.print("Por favor, ingrese un número positivo: ");
            try {

                int numero = scanner.nextInt();


                if (numero < 0) {
                    throw new IllegalArgumentException("El número debe ser positivo.");
                }

                System.out.println("Número ingresado: " + numero);
                numeroValido = true; 

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Debe ingresar un número.");
                scanner.next();
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}

