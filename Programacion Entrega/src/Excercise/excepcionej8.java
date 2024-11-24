package Main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
    public class excepcionej8 {
    	 public static void main(String[] args) {
             Scanner scanner = new Scanner(System.in);
             System.out.print("Ingrese la ruta del archivo que desea leer: ");
             String rutaArchivo = scanner.nextLine();

             try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                 String linea;
                 System.out.println("Contenido del archivo:");
                 while ((linea = br.readLine()) != null) {
                     System.out.println(linea);
                 }
             } catch (FileNotFoundException e) {
                 System.out.println("Error: El archivo no fue encontrado. Asegúrese de que la ruta sea correcta.");
             } catch (IOException e) {
                 System.out.println("Error: Ocurrió un error durante la lectura del archivo.");
             } finally {
                 scanner.close();
             }
         }
     }
    	