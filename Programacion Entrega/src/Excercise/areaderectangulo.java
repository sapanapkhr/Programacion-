package Main;
import java.util.Scanner;
public class areaderectangulo {
public static void main(String[] args ) {
 // Crear un objeto Scanner para recibir datos desde la csonsola
	Scanner scanner = new Scanner(System.in);
	
	
	System.out.print("Ingresa el largo del rectangulo:");
	double largo = scanner.nextDouble(); 
	
	System.out.print("Ingresa el ancho del rectangulo:");
	double ancho = scanner.nextDouble();
	double area = largo * ancho;
	System.out.println("El area de rectangulo es:" + area);
	
	
}
}


