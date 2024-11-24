package Main;
import java.util.Scanner;
public class tablademultiplica {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero: ");
		int numero = scanner.nextInt();
			
			System.out.println("Tabla de multiplicar" + numero + "es: " );
			for (int i = 1; i <= numero; i++) {
				System.out.println (numero* i);   
			}
			{
			
		}
	}

}
