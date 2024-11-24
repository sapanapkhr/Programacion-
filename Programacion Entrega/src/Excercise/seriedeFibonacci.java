package Main;
import java.util.Scanner;
public class seriedeFibonacci {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
      System.out.println("Introduce el valor de N: ");
      int N = scanner.nextInt();
      
      int a = 0; 
      int b = 1;
      
      for (int i = 0; i < N; i++) {
          System.out.print(a + " ");
          int siguiente = a + b;
          a = b;
          b = siguiente;
      }
      scanner.close();
  }
}