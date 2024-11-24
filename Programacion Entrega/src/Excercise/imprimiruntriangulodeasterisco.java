package Main;
import java.util.Scanner;
public class imprimiruntriangulodeasterisco {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

