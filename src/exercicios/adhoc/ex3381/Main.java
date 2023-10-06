package exercicios.adhoc.ex3381;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	private static final String T = "T";
	private static final String A = "A";
	private static final String E = "E";

	private static int needToValidate;
	private static int sizeList;

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		int testCase = 1;
		while (resolveProblem(scan, testCase) != 0) {
			testCase++;
		}
		scan.close();
	}

	private static int resolveProblem(Scanner scan, final int testCase) {
		final byte amountList = scan.nextByte();
		if (amountList == 0) {
			return 0;
		}
		else if(testCase > 1) {
			System.out.println();
		}
		System.out.println(String.format("Test case # %s", testCase));
		byte[] sizes = new byte[amountList];
		for (int i = 0; i < amountList; i++) {
			sizes[i] = scan.nextByte();
		}
		final boolean[] populatedList = transformTxtToArrayBoolean(scan.next());
		final byte amountCombination = scan.nextByte();
		final String[] combinations = new String[amountCombination];
		for (int i = 0; i < amountCombination; i++) {
			combinations[i] = scan.next();
		}

		int times = 1;
		for (final String combination : combinations) {
			buildParamsAndPrintResult(amountList, sizes, populatedList, amountCombination, combination, times);
			times++;
		}
		return 1;
	}

	private static void buildParamsAndPrintResult(final byte amountList, byte[] sizes, final boolean[] populatedList,
			final byte amountCombination, final String combination, final int times) {
		needToValidate = populatedList.length;
		sizeList = needToValidate;
		int jumpEnd = 1;
		int jumpGroup = 1;
		boolean beginWithA = false;
		// A2E1
		Combination[] combs = getCombinations(combination, amountList);
		for (int i = 0; i < combs.length; i++) {
			// A2
			final Combination comb = combs[i];
			if (E.equals(comb.letter)) {
				final byte combinationNumberValue = sizes[comb.number - 1];
				if (sizeList == populatedList.length) {
					beginWithA = i > 0;
					sizeList /= combinationNumberValue;
					needToValidate = sizeList;
					jumpGroup = sizeList;
					if (comb.number == amountList) {
						// last
						jumpEnd = sizes[sizes.length - 1];
						jumpGroup = 1;
					} else if (comb.number == amountList - 1) {
						// penultimate
						// penultimateSizeValue * lastSizeValue
						jumpGroup = sizes[sizes.length - 1];// 4
						jumpEnd = sizes[sizes.length - 2] * jumpGroup;// 8
					}
				} else {
					needToValidate /= combinationNumberValue;
				}
			}
		}
		printResult(populatedList, jumpEnd, jumpGroup, times, beginWithA);
	}

	private static void printResult(final boolean[] populatedList, int jumpEnd, int jumpGroup, final int time, final boolean beginWithA) {
		System.out.println(String.format("  Query # %s is %s.", time, verifyQuery(populatedList, jumpEnd, jumpGroup, sizeList, beginWithA)));
	}

	private static Combination[] getCombinations(final String combination, final byte amountList) {
		// A2E1
		Combination[] vet = new Combination[amountList];
		String comb = combination;
		for (int i = 0; i < amountList; i++) {
			Combination c = new Combination();
			c.letter = comb.charAt(0) + "";
			StringBuilder n = new StringBuilder();
			n.append(comb.charAt(1));
			if (comb.length() > 2 && !A.equals(comb.charAt(2) + "") && !E.equals(comb.charAt(2) + "")) {
				n.append(comb.charAt(2));
				comb = comb.substring(1);
			}
			comb = comb.substring(2);
			c.number = Integer.valueOf(n.toString());
			vet[i] = c;
		}
		return vet;
	}

	private static boolean[] transformTxtToArrayBoolean(String text) {
		boolean[] vet = new boolean[text.length()];
		for (int i = 0; i < text.length(); i++) {
			vet[i] = T.equals(text.charAt(i) + "");
		}
		return vet;
	}

	private static boolean verifyQuery(final boolean[] populatedList, final int jumpEnd, final int jumpGroup,
			final int sizeMax, final boolean beginWithA) {
		for (int i = 0; i < populatedList.length; i += jumpGroup) {
			// Group
			int count = 0;
			int size = 0;
			for (int j = i; j < populatedList.length; j += jumpEnd) {

				for (int k = j; k < (j + jumpGroup) && k < populatedList.length; k++) {
					count += populatedList[k] ? 1 : 0;
					size++;
					if(!populatedList[k] && beginWithA) {
						return false;
					}
					if (count == needToValidate) {
						return true;
					}
				}
				if (size == sizeMax) {
					break;
				}
			}
		}
		return false;
	}

}

class Combination {
	String letter;
	int number;

	public Combination() {
	}

	public Combination(String letter, int number) {
		this.letter = letter;
		this.number = number;
	}

	@Override
	public String toString() {
		return String.format("{letter = '%s' | number = '%s'}", letter, number);
	}
}