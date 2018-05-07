package exercicios.ex1049;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String a, b, c;
		Scanner leia = new Scanner(System.in);
		a = leia.nextLine();
		b = leia.nextLine();
		c = leia.nextLine();
		leia.close();
		
		if(a.equals("vertebrado")){
			if(b.equals("ave")){
				if(c.equals("carnivoro")){
					System.out.println("aguia");
				}
				else{//onivoro
					System.out.println("pomba");
				}
			}
			else{//mamifero
				if(c.equals("onivoro")){
					System.out.println("homem");
				}
				else{//onivoro
					System.out.println("vaca");
				}
			}
		}
		else{//invertebrado
			if(b.equals("inseto")){
				if(c.equals("hematofago")){
					System.out.println("pulga");
				}
				else{//herbivoro
					System.out.println("lagarta");
				}
			}
			else{//anelido
				if(c.equals("hematofago")){
					System.out.println("sanguessuga");
				}
				else{//onivoro
					System.out.println("minhoca");
				}
			}
		}
	}
}