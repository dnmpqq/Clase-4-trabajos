package PAQUECLASE4;

import java.util.Arrays;
import java.util.Scanner;

public class CLASETP4 {

	public static void main(String[] args) {
		Scanner scanner  = new Scanner (System.in);
		
		int vector [] = new int [3];
		char arrayLetra [] = new char [1];
		for (int i =0;i<arrayLetra.length;i++) {
		System.out.println("Ingrese el caracter");
		arrayLetra[i] = scanner.next().charAt(0);
		}
		for (int i=0;i<vector.length;i++) {
			System.out.println("Ingrese el valor del vector numero "+(i+1) );
			 vector[i]  = scanner.nextInt(); 
		}
		
       Arrays.sort(vector);
       //Orden ascendente del vector y el array del char
       for (char caracter : arrayLetra ) {
    	  System.out.print(arrayLetra);
    		   
    	   
    	   }
       for (int i=0;i<vector.length;i++) {
    	  
    	   System.out.print("-"+vector[i]);
    	   
       }
       System.out.println();
       //orden descendente del vector y el char
       int vectorInvertido []= new int [vector.length];
	  Arrays.sort(vector);
      for (int i=0;i<vector.length;i++) {
    	  vectorInvertido[i]=vector [vector.length-i-1];
    	  System.out.print (vectorInvertido[i]+"-");
    	  
      }
      for (char caracter : arrayLetra ) {
    	  System.out.print(arrayLetra);
    		   
    	   
    	   }
}
}