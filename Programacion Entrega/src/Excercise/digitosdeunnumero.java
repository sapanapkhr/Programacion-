package Main;
import java.util.Scanner;
public class digitosdeunnumero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero positivo:");
		int numero = scanner.nextInt();
		
		//Verificar si el numero es positivo
		if (numero <= 0) {
		 System.out.println("El numero debe ser entero positivo:");
		}else {
			int contador = 0; //variable para contar los digitos 
			
			//Usar while para contar los digitos
			while ( numero > 0) {
				numero /= 10; //Dividir el numero por 10
				contador++; //Incrementar el contador
				System.out.println("El numero" + numero + " tiene " + contador + "digitos:");
				
				
			}
		}
	}
	
}
