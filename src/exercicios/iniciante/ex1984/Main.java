package exercicios.iniciante.ex1984;

import java.io.IOException;
import java.util.Scanner;

/**
 * beecrowd | 1984
 * 
 * O Enigma do Pronal�ndia Por Victor Jatob�, UNIME BR Brazil
 * 
 * Timelimit: 1 Os cientistas da NASA descobriram um novo exoplaneta que fica a
 * 1 bilh�o de anos luz da terra. O nome desse planeta foi batizado de
 * Pronal�ndia em homenagem aos novos cientistas que est�o sendo formados no
 * PRONATEC. S� que o mais incr�vel ainda est� por vir. Ao observar melhor o
 * planeta eles conseguiram identificar que os habitantes da Pronal�ndia estavam
 * querendo se comunicar por uma numera��o. S� que a numera��o que encontraram
 * est� invertida e como encontraram muitas delas chamaram voc� para conseguir
 * automatizar esse processo. Logo, dado um n�mero grande, sua tarefa � imprimir
 * esse n�mero invertido.
 * 
 * Entrada O arquivo cont�m apenas uma linha de teste que � o n�mero encontrado
 * (0 < n < 9999999999).
 * 
 * Obs.: Perceba que o n�mero lido � muito alto para armazenar em uma vari�vel
 * do tipo int, logo voc� ir� precisar utilizar o tipo long, que para a leitura
 * e impress�o em C, voc� deve utilizar o %llu.
 * 
 * Sa�da Imprimir o n�mero lido invertido. N�o esque�a de imprimir a quebra de
 * linha (\n) no final, caso contr�rio voc� receber� (Presentation Error).
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		final String input = scan.next();
		StringBuilder txt = new StringBuilder();
		txt.append(execute(input)).append("\n");
		System.out.print(txt);
		scan.close();
	}

	public static String execute(final String input) {
		StringBuilder txt = new StringBuilder();
		for (int i = input.length() - 1; i >= 0; i--) {
			txt.append(input.charAt(i));
		}
		return txt.toString();
	}
}