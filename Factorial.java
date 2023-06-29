package tarea8;

import java.util.Scanner;

public class Factorial {

	Scanner scanner = new Scanner(System.in);
	
	public void factorNumeros () {
		System.out.println("Escribe un numero");
		int numero = scanner.nextInt();
		
		int  factorial= 33;
		
		int i =1;
		
		do {
			 int factor =factorial*numero;
			i++;
		}
		while(i< factorial);
		System.out.println("El factorial de " + numero + " es: " + factorial);
		
	}
}
