package Main;
import java.util.Scanner;
public class ordenarunarraylist {
	 public static void main(String[] args) {
	        ArrayList<Integer> lista = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);
	        
	        for (int i = 0; i < 10; i++) {
	            lista.add(i + 1);  // Inicializa la lista con valores 1, 2, ..., 10
	        }
	        
	        System.out.println("Lista inicial: " + lista);
	        
	        for (int i = 0; i < 3; i++) {  // Permite hacer 3 actualizaciones
	            System.out.print("Introduce el índice (0-9) de la posición a actualizar: ");
	            int indice = scanner.nextInt();
	            System.out.print("Introduce el nuevo valor para el índice " + indice + ": ");
	            int nuevoValor = scanner.nextInt();
	            
	            lista.set(indice, nuevoValor);
	            System.out.println("Lista actualizada: " + lista);
	        }
	 }
}
