package Main;
import java.util.Scanner;
public class factorialdeunnumero {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entero positivo: ");
		int numero = scanner.nextInt();
		if (numero < 0) {
			System.out.println("Por favor, ingrese un numero positivo: ");
		}else {
			long factorial = 1;
			for ( int i = 1; i <= numero; i++) {
				factorial *= i;
				
				System.out.println("El factorial de" + numero + "es: " + factorial);
						
				
			}
		}
		
	
	}

}
