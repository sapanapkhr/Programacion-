package Main;
public class sumadenumpares1a100bucle {
	public static void main(String[] args) {
		
		int suma = 0;
				for (int i = 1; i <= 100; i++) {
					
					if (i % 2 == 0) {
						suma += i;
					System.out.println("La suma de los numeros pres del 1 al 100 es:" + suma);
					
					}
				}
	}
}
