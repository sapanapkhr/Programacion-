package Main;
import java.util.Scanner;
public class sumadenumerosparesyimpares {
	public static void main(String args) {
	Scanner scanner = new Scanner(System.in);
    int sumaPares = 0, sumaImpares = 0;
    
    for (int i = 0; i < 10; i++) {
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            sumaPares += numero;
        } else {
            sumaImpares += numero;
        }
    }
    
    System.out.println("Suma de números pares: " + sumaPares);
    System.out.println("Suma de números impares: " + sumaImpares);
    scanner.close();
}
}




