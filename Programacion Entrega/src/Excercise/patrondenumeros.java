package Main;
import java.util.Scanner;
public class patrondenumeros {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de filas (N): ");
        int N = scanner.nextInt();
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}





