package tarea8;

import java.util.Scanner;

public class NegativoCinco {
	Scanner scanner= new Scanner(System.in);
	
	
	public void MayorCinco (){
		int i=0;
		while (true) {
		    System.out.println("ingresa un numero");
		    int ingresado = scanner.nextInt();
		    System.out.println("Es numero valido");
		    
		    if (ingresado > -5) {
		    	break;
		    }
		    	i++;
		} 
		
	}
}
