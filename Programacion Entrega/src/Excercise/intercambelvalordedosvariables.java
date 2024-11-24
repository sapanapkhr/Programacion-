package Main;
public class intercambelvalordedosvariables {
	public static void main(String[] args) {
		int a = 5;
		int b= 10;
		System.out.println("Antes del intercambio:");
		System.out.println("a= " + a);
		System.out.println("b= "+ b);
		//Intercambiar valores usando una variable temporal
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Despues del intercambio:");
		System.out.println("a= "  + a);
		System.out.println("b= "  + b);
		
		
		
	}

}
