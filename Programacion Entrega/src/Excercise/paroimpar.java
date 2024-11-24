package Main;
import java.util.Scanner;

public class paroimpar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa un numero entero: ");
		// Pedir a usuario que ingrese un numero
		int numero = scanner.nextInt();
		 //Determinar si el numero es par o impar
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par. ");
			} else {
				System.out.println("El numero " + numero + " es impar.");
				scanner.close();
			}
	}

}
