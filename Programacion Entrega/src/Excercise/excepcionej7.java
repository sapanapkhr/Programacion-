package Main;
public class excepcionej7 {
	 public static void main(String[] args) {
         Persona persona = new Persona("Juan");
         try {
             persona.establecerEdad(-5); 
         } catch (EdadInvalidaException e) {
             System.out.println("Error: " + e.getMessage());
         }

         try {
             persona.establecerEdad(25); 
             System.out.println("Edad de " + persona.getNombre() + ": " + persona.getEdad());
         } catch (EdadInvalidaException e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
 }