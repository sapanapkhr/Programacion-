package Main;

public class arrayencontrarlafilaconsumamasalta {
	 public static void main(String[] args) {
	        int[][] matriz = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        
	        int maxSuma = Integer.MIN_VALUE;
	        int filaConMaxSuma = -1;
	        
	        for (int i = 0; i < matriz.length; i++) {
	            int sumaFila = 0;
	            for (int j = 0; j < matriz[i].length; j++) {
	                sumaFila += matriz[i][j];
	            }
	            if (sumaFila > maxSuma) {
	                maxSuma = sumaFila;
	                filaConMaxSuma = i;
	            }
	        }
	 }}
