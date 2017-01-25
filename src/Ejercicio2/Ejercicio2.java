package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 2. Programa que lee por teclado el valor del radio de una
		 * circunferencia y calcula y muestra por pantalla la longitud y el área
		 * de la circunferencia.
		 * 
		 * Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia
		 * = PI*Radio^2
		 */

		float numero = invocacion();
		float numero2 = invocacion2();
		System.out.println("El area de la circunferencia es: " + numero);
		System.out.println("La longitud de la circunferencia es: " + numero2);
	}

	public static float invocacion() {
		float pi = 3.14F;
		float radio = 0;
		float area = 0;
		System.out.println("Introduce el radio de la circunferencia");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextFloat();

		area = pi * (radio * radio);

		return area;
	}

	public static float invocacion2() {
		float pi = 3.14F;
		float radio = 0;
		float longitud = 0;
		System.out.println("Introduce el radio de la circunferencia");
		Scanner teclado = new Scanner(System.in);
		radio = teclado.nextFloat();
		longitud = 2 * pi * radio;

		return longitud;
	}

}
