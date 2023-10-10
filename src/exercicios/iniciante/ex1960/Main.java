package exercicios.iniciante.ex1960;

import java.io.IOException;
import java.util.Collections;
import java.util.Scanner;

/**
 * beecrowd | 1960 Numeração Romana para Números de Página
 * 
 * A ECI (Editio Chronica Incredibilis ou Editora de Crônicas Incríveis) é muito
 * tradicional quando se trata de numerar as páginas de seus livros. Ela sempre
 * usa a numeração romana para isso. E seus livros nunca ultrapassam as 999
 * páginas pois, quando necessário, dividem o livro em volumes.
 * 
 * Você deve escrever um programa que, dado um número arábico, mostra seu
 * equivalente na numeração romana.
 * 
 * Lembre que I representa 1, V é 5, X é 10, L é 50, C é 100, D é 500 e M
 * representa 1000.
 * 
 * Entrada A entrada é um número inteiro positivo N (0 < N < 1000).
 * 
 * Saída A saída é o número N escrito na numeração romana em uma única linha.
 * Use sempre letras maiúsculas.
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