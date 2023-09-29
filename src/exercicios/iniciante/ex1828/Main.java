package exercicios.iniciante.ex1828;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

	private static final String RESPONSE = "Caso #%s: %s!\n";
	private static final String BAZINGA = "Bazinga";
	private static final String RAJ_CHEATED = "Raj trapaceou";
	private static final String AGAIN = "De novo";

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		final byte times = scan.nextByte();

		for (int i = 1; i <= times; i++) {
			final Option sheldon = Option.get(scan.next());
			final Option raj = Option.get(scan.next());
			switch (sheldon.isBetterThan(raj)) {
			case VICTORY:
				text.append(String.format(RESPONSE, i, BAZINGA));
				break;
			case DEFEAT:
				text.append(String.format(RESPONSE, i, RAJ_CHEATED));
				break;
			default:
				// TIE
				text.append(String.format(RESPONSE, i, AGAIN));
				break;
			}
		}
		System.out.print(text);
		scan.close();
	}

}

enum Result {
	VICTORY, DEFEAT, TIE;
}

enum Option {
	PAPEL("papel", Arrays.asList("PEDRA", "SPOCK")), 
	PEDRA("pedra", Arrays.asList("TESOURA", "LAGARTO")),
	LAGARTO("lagarto", Arrays.asList("PAPEL", "SPOCK")), 
	SPOCK("Spock", Arrays.asList("PEDRA", "TESOURA")),
	TESOURA("tesoura", Arrays.asList("PAPEL", "LAGARTO"));

	String description;
	List<String> betterThan;

	private Option(String description, List<String> betterThan) {
		this.description = description;
		this.betterThan = betterThan;
	}

	public static Option get(final String option) {
		return Option.valueOf(option.toUpperCase());
	}

	public Result isBetterThan(Option option) {
		return this.equals(option) ? Result.TIE
				: (this.betterThan.contains(option.toString()) ? Result.VICTORY : Result.DEFEAT);
	}
}