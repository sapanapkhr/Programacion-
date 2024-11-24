package Main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException
public class excepcion3 {
	public class MainJava {
		  public static void main(String[] args) {
		        BufferedReader reader = null;
		        try {
		            reader = new BufferedReader(new FileReader("archivo.txt"));
		            String linea;
		            while ((linea = reader.readLine()) != null) {
		                System.out.println(linea);
		            }
		        } catch (IOException e) {
		            System.out.println("Error al leer el archivo: " + e.getMessage());
		        } finally {
		            try {
		                if (reader != null) {
		                    reader.close();
		                }
		            } catch (IOException e) {
		                System.out.println("Error al cerrar el archivo: " + e.getMessage());
		            }
		        }
		    }

		}
	}
	  