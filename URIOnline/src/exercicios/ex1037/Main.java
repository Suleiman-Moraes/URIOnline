package exercicios.ex1037;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		float a = leia.nextFloat();
		
        if (a >=0 && a <= 25.0000) {


            System.out.printf("Intervalo [0,25]\n");


        }else if (a >= 25.00001 && a <= 50.0000000) {


            System.out.printf("Intervalo (25,50]\n");


        }else if (a >= 50.00001 && a <= 75.0000000) {


            System.out.printf("Intervalo (50,75]\n");


        }else if (a >= 75.00001 && a<=100.0000000) {


            System.out.printf("Intervalo (75,100]\n");


        }else {


            System.out.print("Fora de intervalo\n");


        }
		leia.close();
	}
}