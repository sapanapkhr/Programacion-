package Main;
class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }
}

public class excepcionej9 {
	public static void main(String[] args) {
		  double numerador = 10;
          double denominador = 0; 
          try {
              double resultado = dividir(numerador, denominador);
              System.out.println("El resultado de la división es: " + resultado);
          } catch (DivisionPorCeroException e) {
              System.out.println("Error: " + e.getMessage());
          }
      }

      // Método para dividir dos números
      public static double dividir(double numerador, double denominador) throws DivisionPorCeroException {
          if (denominador == 0) {
              throw new DivisionPorCeroException("No se puede dividir por cero.");
          }
          return numerador / denominador;
      }
  }