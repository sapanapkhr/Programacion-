package Main;
import java.util.Scanner;
import java.util.InputMismatchException;
public class excepcionej1 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        try {
	            System.out.print("Ingresa un número entero: ");
	            int numero = scanner.nextInt();
	            System.out.println("Has ingresado: " + numero);
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Debes ingresar un número entero.");
	        } finally {
	            scanner.close();
	        }
	    }
	}
	class EdadInvalidaException extends Exception {
	    public EdadInvalidaException(String mensaje) {
	        super(mensaje);
	    }
	}


