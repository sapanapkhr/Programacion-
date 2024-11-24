package Main;
import java.util.Scanner;
public class eliminarelementosduplicados {
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
	        
	        HashSet<Integer> conjunto = new HashSet<>(lista);
	        lista.clear();
	        lista.addAll(conjunto);
	        
	        System.out.println("Lista sin duplicados: " + lista);
	        
	        scanner.close();
	    }
	}





