package Main;

public class excepcionej6 {
	class EdadInvalidaException extends Exception {
        public EdadInvalidaException(String mensaje) {
            super(mensaje);
        }
    }


    class Persona {
        private String nombre;
        private int edad;

        public Persona(String nombre) {
            this.nombre = nombre;
        }

        public void establecerEdad(int edad) throws EdadInvalidaException {
            if (edad < 0) {
                throw new EdadInvalidaException("La edad no puede ser negativa.");
            }
            this.edad = edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }
    }

}
