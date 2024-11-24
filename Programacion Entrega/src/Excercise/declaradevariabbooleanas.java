package Main;

public class declaradevariabbooleanas {
public static void main(String[] args) {

	boolean variable1 = true;
	boolean variable2 = false;
	
	boolean resultadoAND = variable1 && variable2;
	boolean resultadoOR = variable1 || variable2;
	boolean resultadoNOT1 = !variable1;
	boolean resultadoNOT2 = !variable2;
	
	System.out.println("Resultado de AND entre variable1 && variable2" + resultadoAND);
	System.out.println("Resultado de OR entre variable 1 || variable2" + resultadoOR);
	System.out.println("Resultado de NOT sobre variable1" + resultadoNOT1);
	System.out.println("Resultado de NOT sobre variable2" + resultadoNOT2);
}
}