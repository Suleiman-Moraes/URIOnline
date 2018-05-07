package exercicios.ex1043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		float a, b, c;
		Scanner leia = new Scanner(System.in);
		a = leia.nextFloat();
		b = leia.nextFloat();
		c = leia.nextFloat();
		leia.close();
		if(a+b > c && a+c > b && b+c > a){
			System.out.println("Perimetro = " + (a + b + c));
		}else{
			System.out.println("Area = " + (((a + b) * c) / 2));
		}
	}
}