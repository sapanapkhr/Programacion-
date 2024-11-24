package Main;
import java.util.Scanner;

public class actualizaciondeelementosenarray {
	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();
            lista.add(numero);
        }
        
        System.out.print("Introduce el número a buscar: ");
        int buscar = scanner.nextInt();
        
        if (lista.contains(buscar)) {
            System.out.println("El número está en el índice: " + lista.indexOf(buscar));
        } else {
            System.out.println("El número no está presente en la lista.");
        }
        
        scanner.close();
    }
}