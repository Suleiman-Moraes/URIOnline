package exercicios.ex1020;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a = leia.nextInt();
		
		int inte = a / 365;
		int rest = a % 365;
		int ano = inte;
		
		inte = rest / 30;
		rest = rest % 30;
		int mes = inte;
		
		
		int dia = rest;
		System.out.println(ano + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		leia.close();
	}
}