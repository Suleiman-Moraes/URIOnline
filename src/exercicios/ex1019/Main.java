package exercicios.ex1019;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a = leia.nextInt();
		
		int inte = a / 60;
		int rest = a % 60;
		int seg = rest;
		
		rest = inte % 60;
		inte = inte / 60;
		int min = rest;
		
		int hor = inte;
	
		System.out.println(hor + ":" + min + ":" + seg);
		
		leia.close();
	}
}