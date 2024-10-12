package exercicios.iniciante.ex2139;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * beecrowd | 2139 Natal de Pedrinho Por Joao Marcos Salvanini Bellini de
 * Moraes, IFSULDEMINAS BR Brazil
 * 
 * Timelimit: 1 Pedrinho é um garoto que adora festas em família, principalmente
 * o Natal, quando ganha presente dos pais e dos avós. Esse ano, seu pai lhe
 * prometeu um PS4, mas somente se Pedrinho conseguir resolver alguns desafios
 * ao longo do ano, sendo um deles, escrever um programa que calcule quantos
 * dias faltam para o Natal.
 * 
 * Entretanto, Pedrinho tem somente 9 anos e não tem noção alguma de
 * programação, mas sabe que você, primo dele, mexe com "coisas de computador",
 * e dessa forma, pediu para você escrever o programa para ele. Não somente
 * isso, mas prometeu que deixaria você jogar todo final de semana e por quanto
 * tempo quiser!
 * 
 * Entrada A entrada é composta por vários casos de teste. Cada linha contém o
 * mês e o dia do ano de 2016 (ano bissexto). A entrada termina com fim de
 * arquivo.
 * 
 * Saída Se for Natal, imprima "E natal!"; se faltar somente um dia, imprima "E
 * vespera de natal!"; se já passou, imprima "Ja passou!". Caso contrário,
 * imprima "Faltam X dias para o natal!", sendo X o número de dias que faltam
 * para o Natal.
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder builder = new StringBuilder();
		while (scan.hasNextInt()) {
			final int month = scan.nextInt();
			final int day = scan.nextInt();
			builder.append(execute(month, day)).append("\n");
		}
		System.out.print(builder);
		scan.close();
	}

	public static String execute(int month, int day) {
		final LocalDateTime christmas = LocalDateTime.of(2016, 12, 25, 12, 00);
		final LocalDateTime date = LocalDateTime.of(2016, month, day, 12, 00);
		final Duration duration = Duration.between(date, christmas);
		final long days = duration.toDays();
		if (days < 0) {
			return "Ja passou!";
		} else if (days == 0) {
			return "E natal!";
		} else if (days == 1) {
			return "E vespera de natal!";
		} else {
			return String.format("Faltam %s dias para o natal!", days);
		}
	}
}