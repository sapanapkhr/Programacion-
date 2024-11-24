package Main;
import java.util.Scanner;
public class juegodeadivinaza {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        int numeroSecreto = random.nextInt(100) + 1;
	        int intentos = 0;
	        int maxIntentos = 5;
	        int intento;
	        
	        while (intentos < maxIntentos) {
	            System.out.print("Adivina el número (Intento " + (intentos + 1) + " de " + maxIntentos + "): ");
	            intento = scanner.nextInt();
	            intentos++;
	            
	            if (intento < numeroSecreto) {
	                System.out.println("El número es mayor.");
	            } else if (intento > numeroSecreto) {
	                System.out.println("El número es menor.");
	            } else {
	                System.out.println("¡Felicidades! Has adivinado el número.");
	                break;
	            }
	        }

