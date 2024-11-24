package Main;
import java.util.Scanner;
public class advinarunnumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1;
        int intento;
        
        do {
            System.out.print("Adivina el número entre 1 y 100: ");
            intento = scanner.nextInt();
            
            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            }
        } while (intento != numeroSecreto);
        
        System.out.println("¡Felicidades! Has adivinado el número.");
        scanner.close();
    }
}





