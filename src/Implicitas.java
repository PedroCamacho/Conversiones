
public class Implicitas {

	public static void main(String[] args) {
		// Caso 1 - Para imprimir
		int miInt = 456;
		System.out.println("El número de tipo 'int' es: " + miInt);
		
		// Caso 2 - Para almacenar	
		byte dato1 = 3;
		short dato2 = 5;
		dato2 = dato1;
		System.out.println("El número de tipo 'short' es: " + dato2);
	}

}
