package Main;
import java.util.Scanner;
public class conversiondearraylist {
	  public static void main(String[] args) {
	        ArrayList<Integer> lista = new ArrayList<>();
	        Random random = new Random();
	        
	        for (int i = 0; i < 10; i++) {
	            lista.add(random.nextInt(100) + 1);
	        }
	        
	        Integer[] array = new Integer[lista.size()];
	        lista.toArray(array);
	        
	        System.out.print("Array convertido: ");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }
	    }
	}

