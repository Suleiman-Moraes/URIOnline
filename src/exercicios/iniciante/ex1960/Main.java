package exercicios.iniciante.ex1960;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

/**
 * beecrowd | 1960 Numera��o Romana para N�meros de P�gina
 * 
 * A ECI (Editio Chronica Incredibilis ou Editora de Cr�nicas Incr�veis) � muito
 * tradicional quando se trata de numerar as p�ginas de seus livros. Ela sempre
 * usa a numera��o romana para isso. E seus livros nunca ultrapassam as 999
 * p�ginas pois, quando necess�rio, dividem o livro em volumes.
 * 
 * Voc� deve escrever um programa que, dado um n�mero ar�bico, mostra seu
 * equivalente na numera��o romana.
 * 
 * Lembre que I representa 1, V � 5, X � 10, L � 50, C � 100, D � 500 e M
 * representa 1000.
 * 
 * Entrada A entrada � um n�mero inteiro positivo N (0 < N < 1000).
 * 
 * Sa�da A sa�da � o n�mero N escrito na numera��o romana em uma �nica linha.
 * Use sempre letras mai�sculas.
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final short value = scan.nextShort();
		System.out.println(execute(value));
		scan.close();
	}

	public static String execute(int value) {
		StringBuilder txt = new StringBuilder();
		final RomanNumeral[] vet = RomanNumeral.values();
		for (int i = vet.length - 1; i >= 0; i--) {
			final RomanNumeral romanNumeral = vet[i];
			int integerPart = value / romanNumeral.value;
			value -= romanNumeral.value * integerPart;
			txt.append(String.join("", Collections.nCopies(integerPart, romanNumeral.name())));
		}

		return txt.toString();
	}

}

enum RomanNumeral {
	I(1), IV(4), V(5), IX(9), X(10), XL(40), L(50), XC(90), C(100), CD(400), D(500), CM(900), M(1000);

	int value;

	private RomanNumeral(int value) {
		this.value = value;
	}
}