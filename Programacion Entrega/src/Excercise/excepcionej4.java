package Main;

public class excepcionej4 {
	 public static double dividir(int numerador, int denominador) throws ArithmeticException {
	        return numerador / denominador;
	    }

	    public static void main(String[] args) {
	        try {
	            System.out.println(dividir(10, 0));
	        } catch (ArithmeticException e) {
	            System.out.println("Error: No se puede dividir por cero.");
	        }
	    }


	}
