import java.util.Scanner;

public class centigrados_a_farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Programa que lea una cantidad de grados cent�grados y la pase a
		 * grados Fahrenheit. La f�rmula correspondiente para pasar de grados
		 * cent�grados a fahrenheit es: F = 32 + ( 9 * C / 5)
		 */

		int grados=0;
		int fahrenheit=0;
		
		System.out.println("Introduce la cifra de mierda en centigrados");
		Scanner teclado = new Scanner(System.in);
		grados=teclado.nextInt();
		
		fahrenheit=grados*9/5+32;
		
		System.out.println(grados+" Grados cent�grados equivalen a "+fahrenheit+" fahrenheit");
		
	}

}
