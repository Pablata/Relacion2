package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 3. Programa que pase una velocidad en Km/h a m/s. La velocidad se lee
		 * por teclado.
		 */

		float conversion = summon();
		System.out.println("Los datos introducidos equivalen en metros por segundo a: "+conversion);
		
		
	}

	
public static float summon(){
	float kmh=0;
	float mtrs=0;
	System.out.println("Introduzca la velocidad en km/h");
	Scanner teclado= new Scanner(System.in);
	kmh = teclado.nextFloat();
	
	mtrs=(kmh/3.6F);
return mtrs;
}
	
}
