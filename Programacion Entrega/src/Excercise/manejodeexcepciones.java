package Main;
import java.util.Scanner;
public class manejodeexcepciones {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        boolean inputValido = false;
        
        // Bucle hasta que el usuario ingrese un número entero válido
        while (!inputValido) {
            try {
                System.out.print("Introduce un número entero: ");
                numero = scanner.nextInt();  // Intentar leer un número entero
                inputValido = true;  // Si la lectura es exitosa, salir del bucle
            } catch (InputMismatchException e) {
                System.out.println("Error: Se debe ingresar un número entero.");
                scanner.nextLine(); // Limpiar el buffer del Scanner
            }
        }
        
        System.out.println("Número ingresado: " + numero);
        
        scanner.close();
    }
}

