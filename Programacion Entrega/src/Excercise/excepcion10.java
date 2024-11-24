package Main;
import java.util.InputMismatchException;
import java.util.Scanner;
public class excepcion10 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.print("Ingrese el numerador: ");
                double numerador = scanner.nextDouble();

                System.out.print("Ingrese el denominador: ");
                double denominador = scanner.nextDouble();

                // Realizar la división
                double resultado = dividir(numerador, denominador);
                System.out.println("El resultado de la división es: " + resultado);
                continuar = false; // Salir del bucle si la operación fue exitosa

            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Asegúrese de ingresar números.");
                scanner.next(); // Limpiar el buffer del scanner
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir por cero.");
            }
        }

        scanner.close();
    }

    // Método para dividir dos números
    public static double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Denominador no puede ser cero.");
        }
        return numerador / denominador;
    }
}	


