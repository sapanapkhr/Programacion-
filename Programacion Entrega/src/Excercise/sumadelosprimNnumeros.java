package Main;
import java.util.Scanner;
public class sumadelosprimNnumeros {
	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero positivo N:");
		int N = in.nextInt();
		
			while (N <= 0){
				System.out.println(" Error N debe ser un numero entero positivo");
				System.out.println("Ingresa un numero entero positivo N: ");
			 N = in.nextInt();
			}
			int suma = (N * (N + 1))/2;
			System.out.println("La suma de los primeros " + N + "numeros naturales es " + suma );
			
	}

}
