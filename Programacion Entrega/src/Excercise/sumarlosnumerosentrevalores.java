package Main;
import java.util.Scanner;
public class sumarlosnumerosentrevalores {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce el valor de A: ");
	        int A = scanner.nextInt();
	        System.out.print("Introduce el valor de B: ");
	        int B = scanner.nextInt();
	        
	        int suma = 0;
	        
	        for (int i = A; i <= B; i++) {
	            suma += i;
	        }
	        
	        System.out.println("La suma de los números entre " + A + " y " + B + " es: " + suma);
	        scanner.close();
	    }
	}

