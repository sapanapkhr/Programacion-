package Main;

public class excepcionej2 {
	class Persona {
	    private int edad;

	    public void setEdad(int edad) throws EdadInvalidaException {
	        if (edad < 0) {
	            throw new EdadInvalidaException("La edad no puede ser negativa.");
	        }
	        this.edad = edad;
	    }

	    public int getEdad() {
	        return edad;
	    }
	}
}
