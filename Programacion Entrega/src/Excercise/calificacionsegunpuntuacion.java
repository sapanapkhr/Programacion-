package Main;
import java.util.Scanner;
public class calificacionsegunpuntuacion {
  public static void main(String[] args) {

	  Scanner scanner = new Scanner (System.in);
	  System.out.println("Introduce el puntuacion desde 1 a 100:") ;
	  int puntuacion = scanner.nextInt();
	  
	  if (puntuacion >= 90) {
		  System.out.println("Calificacion: A ");
		  
	  } else if (puntuacion >= 80) {
		  System.out.println("Calificacion: B ");
		  
	  } else if (puntuacion >= 70) {
		  System.out.println("Calificacion:C");
		  
	  } else if (puntuacion >= 60) {
		  System.out.println("Calificacion:D");
		   
	  } else {
		  System.out.println("Calificacion:F");
		  
		  
	  }
  }
}	  
  
	  
	  

