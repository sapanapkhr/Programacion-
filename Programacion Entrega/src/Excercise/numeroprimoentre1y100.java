package Main;

public class numeroprimoentre1y100 {
	public static void main(String[] args) {
        for (int num = 2; num <= 100; num++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println(num);
            }
        }
    }

}
