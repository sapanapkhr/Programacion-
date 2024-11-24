package Main;
import java.util.Scanner;
public class contadordevocales {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Introduce una cadena de texto: ");
	        String texto = scanner.nextLine();
	        
	        int contadorVocales = 0;
	        
	        for (int i = 0; i < texto.length(); i++) {
	            char c = Character.toLowerCase(texto.charAt(i));
	            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                contadorVocales++;
	            }
	        }
	        
	        System.out.println("Número de vocales: " + contadorVocales);
	        scanner.close();
	    }
	}






}
