package ArraysDemo;

import java.util.Scanner;

public class PatternDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		int length = word.length();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				if (j == i || i + j == word.length() - 1) {
					System.out.print(word.charAt(j));

				} else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}
