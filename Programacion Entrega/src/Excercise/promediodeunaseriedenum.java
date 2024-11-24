package Main;
import java.util.Scanner;
public class promediodeunaseriedenum {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce la cantidad de números: ");
	        int N = scanner.nextInt();
	        
	        int suma = 0;
	        
	        for (int i = 0; i < N; i++) {
	            System.out.print("Introduce el número " + (i + 1) + ": ");
	            int numero = scanner.nextInt();
	            suma += numero;
	        }
	        
	        double promedio = (double) suma / N;
	        System.out.println("El promedio es: " + promedio);
	        
	        scanner.close();
	    }
	}





