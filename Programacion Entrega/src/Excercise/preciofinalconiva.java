package Main;

public class preciofinalconiva {
	public static void main(String[] args) {
		double preciodeProducto = 100.0;
		double porcentagedeIva = 20.0;
		
		double iva = (preciodeProducto * porcentagedeIva) / 100;
		double precioFinal = (preciodeProducto + iva);
		System.out.println("El precio final con iva es: " + precioFinal);
		
		
}
}