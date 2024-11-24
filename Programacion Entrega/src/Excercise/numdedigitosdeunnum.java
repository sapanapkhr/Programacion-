package Main;
import java.util.Scanner;
public class numdedigitosdeunnum {
	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce un número entero: ");
	        int numero = scanner.nextInt();
	        numero = Math.abs(numero);
	        int digitos = 0;
	        
	        if (numero == 0) {
	            digitos = 1;
	        } else {
	            while (numero > 0) {
	                numero /= 10;
	                digitos++;
	            }
	        }
	        
	        System.out.println("El número de dígitos es: " + digitos);
	        scanner.close();
	    }
	}	