package tarea8;

import java.util.Scanner;

public class Factorial {
    
	public void factorNumeros () {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escribe un número: ");
        int numero = scanner.nextInt();
        
        int[] factorial = new int[numero + 1];
        
        factorial[0] = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial[i] = factorial[i - 1] * i;
        }
        
        System.out.println("El factorial de " + numero + " es: " + factorial[numero]);
    }
}






