package Ejercici1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. Programa que lea una cantidad de grados centígrados y la pase a
		 * grados Fahrenheit. La fórmula correspondiente para pasar de grados
		 * centígrados a fahrenheit es: F = 32 + ( 9 * C / 5)
		 */

		int invocar = conversion();
		System.out.println(invocar);
	}

	public static int conversion() {
		int grados = 0;
		int fahrenheit = 0;

		System.out.println("Introduce la cifra en centigrados");
		Scanner teclado = new Scanner(System.in);
		grados = teclado.nextInt();

		fahrenheit = grados * 9 / 5 + 32;
		System.out.print(grados + " Grados centígrados equivalen a en fahrenheit a ");

		return fahrenheit;
	}
}
