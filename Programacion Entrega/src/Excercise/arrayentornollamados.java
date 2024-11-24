package Main;

public class arrayentornollamados {
	public static void main(String[] args) {
		int[] numeros = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			numeros[1] = i + 1;
		}
		for (int i = 0; i <= numeros.length; i++) {
			System.out.println("El numero en la posicion es: " + i);

		}
		for (int i : numeros)
			System.out.println("el numero es: " + i);
		
	}

}
