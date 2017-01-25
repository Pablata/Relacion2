package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4. Programa lea la longitud de los catetos de un triángulo rectángulo
		 * y calcule la longitud de la hipotenusa según el teorema de Pitágoras.
		 */
		
		float numero=invocar();
		System.out.print("La suma de los dos catetos del triangulo es igual a la hipotenusa:"+numero);
		
		
	}
public static float invocar(){
	
	float cateto1=0;
	float cateto2=0;
	float hipotenusa=0;
	System.out.println("Introduzca el primer cateto");
	Scanner teclado= new Scanner(System.in);
	cateto1 = teclado.nextFloat();
	
	System.out.println("Introduzca el segundo cateto");
	cateto2 = teclado.nextFloat();
			
	hipotenusa=(float) Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	return(hipotenusa);
	
}
}
