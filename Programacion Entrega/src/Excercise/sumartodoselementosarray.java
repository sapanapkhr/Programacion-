package Main;

public class sumartodoselementosarray {
	public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
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
        
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        
        System.out.println("La suma de los elementos es: " + suma);
        
        scanner.close();
    }
}

