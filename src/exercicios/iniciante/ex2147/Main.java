package exercicios.iniciante.ex2147;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 2147 Galopeira Por Ricardo Martins, IFSULDEMINAS BR Brazil
 * 
 * Timelimit: 1 Certo dia, os irm�os Little Chit�o e Xor Or Oh, ex�mios
 * digitadores, fizeram um desafio, para ver quem era o melhor na digita��o.
 * Para isto, conseguiram um computador que n�o processa teclas pressionadas, ou
 * seja, se for para digitar a mesma letra duas vezes seguidas, precisa
 * pressionar a tecla duas vezes, visto que, pressionar a tecla por mais tempo,
 * n�o adianta. Tamb�m mediram o tempo de uma tecla pressionada, que foi de,
 * exatamente, um cent�simo de segundo. O desafio seria quem digitasse a palavra
 * �galopeira�, formada por mais letras e, mas ambos eram muito bons, e chegava
 * num ponto que n�o era poss�vel contar quantas letras haviam sido digitadas.
 * Ent�o, pediram a sua ajuda para escrever um programa que verifique a palavra
 * digitada e veja quanto tempo foi gasto para a digita��o.
 * 
 * Escreva um programa que, dada uma palavra digitada, informe quanto tempo foi
 * gasto para ser digitada.
 * 
 * Entrada Um n�mero inteiro C ser� informado, que ser� a quantidade de casos de
 * teste. Cada caso tem uma palavra, de, no m�nimo, 9 e, no m�ximo 10000 letras.
 * 
 * Sa�da Para cada caso de teste, imprima um n�mero T, que � o tempo gasto, em
 * segundos, para digitar a palavra do respectivo caso de teste, com aproxima��o
 * de duas casas decimais.
 * 
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		final int count = scan.nextInt();
		for (int i = 0; i < count; i++) {
			builder.append(String.format("%.2f\n", execute(scan.next())));
		}
		System.out.print(builder);
		scan.close();
	}

	protected static double execute(String word) {
		return word.length() * 0.01;
	}
}