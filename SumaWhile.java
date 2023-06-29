package tarea8;

import java.util.Scanner;

public class SumaWhile {
Scanner scanner = new Scanner(System.in);
	public void sumaWhile (){
		
		int i=0;
		
	while (true) {
	  System.out.println("Escribe un numero a sumar");
	    int num1 = scanner.nextInt();
	  System.out.println("Escribe un numero a sumar");
        int num2 = scanner.nextInt();
        int suma= num1+num2;
        
       System.out.println("El resultado de la suma es: " + suma);
       System.out.println("Si desea dejar de hacer sumas sume 27660 + 27660");
          
       if (suma == 55320) {
    	   break;
       }
        i++;
	}	
		
	}
		    
}
