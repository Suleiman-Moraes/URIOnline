package exercicios.ex1035;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] num = new int[4];
		String x = leia.nextLine();
		String[] vet = x.replaceAll(" ", "#").split("#");
		for (int i = 0; i < vet.length; i++) {
			num[i] = Integer.parseInt(vet[i]);
		}
		
		if(num[1] > num[2] && num[3] > num[0] && (num[2] + num[3]) > (num[0] + num[1]) && num[2] >= 0 && num[3] >= 0 && num[0] % 2 == 0){
			System.out.println("Valores aceitos");
		}else{
			System.out.println("Valores nao aceitos");
		}
		
		leia.close();
	}
}