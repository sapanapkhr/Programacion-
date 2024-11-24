package Main;
import java.util.Scanner;
public class sumadedosnum {
	public static void main(String[] args) {
		//Crear un objeto Scanner para recibir datos desde la consola
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Ingresa el primer numero: ");
	    int num1 = scanner.nextInt();
	    System.out.print("Ingresa el segundo numero:");
	    	    int num2 = scanner.nextInt();
	    	    int suma = num1 + num2;
	    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
	    
	    
	}


}
