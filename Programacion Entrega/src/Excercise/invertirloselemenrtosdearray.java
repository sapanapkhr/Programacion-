package Main;
import java.util.Scanner;
public class invertirloselemenrtosdearray {
	 public static void main(String[] args) {
	        ArrayList<Integer> lista = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Introduce números enteros. Ingresa un número negativo para terminar.");
	        
	        while (true) {
	            System.out.print("Introduce un número: ");
	            int numero = scanner.nextInt();
	            if (numero < 0) {
	                break;
	            }
	            lista.add(numero);
	        }
	        
	        Collections.reverse(lista);
	        
	        System.out.println("ArrayList en orden inverso: " + lista);
	 }
}


