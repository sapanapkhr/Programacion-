package Main;
import java.util.Scanner;
public class arraylistmetodo {
	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();
            lista.add(numero);
        }
        
        System.out.println("Contenido del ArrayList:");
        for (int num : lista) {
            System.out.println(num);
        }
        
        scanner.close();
    }
}


