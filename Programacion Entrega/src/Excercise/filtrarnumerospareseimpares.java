package Main;

public class filtrarnumerospareseimpares {
	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce números enteros. Ingresa un número negativo para terminar.");
        
        while (true) {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            lista.add(numero);
        }
        
        for (int num : lista) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
        
        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
        
    }
}

