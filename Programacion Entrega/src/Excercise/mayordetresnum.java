package Main;
import java.util.Scanner;
public class mayordetresnum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Ingresa el numero primero: ");
		int numero1 = scanner.nextInt();
		System.out.println("Ingresa el numero segundo: ");
		int numero2 = scanner.nextInt();
		System.out.println("Ingresa el numero tercero: ");
		int numero3 = scanner.nextInt();
		if (numero1 == numero2 && numero2 == numero3) {
			System.out.println("Los tres numeros son iguales: ");
		} else if (numero1 >= numero2 && numero1 >= numero3) {
				System.out.println("El mayor numero es: " + numero1);
		} else if (numero2 >= numero1 && numero2> numero3) {
			System.out.println("El mayor numero es: " + numero2);
		}else {
			System.out.println("El mayor numero es:" + numero3);
			
					
				
		}		
			
			
	}		
}
