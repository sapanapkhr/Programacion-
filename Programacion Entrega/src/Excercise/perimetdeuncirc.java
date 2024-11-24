package Main;
import java.util.Scanner;

public class perimetdeuncirc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce el radio del circulo");
		double radio = scanner.nextDouble();
		double perimetro = 2 * Math.PI * radio;
		System.out.println("El perimetro del circulo es: " + perimetro);
	}

}
