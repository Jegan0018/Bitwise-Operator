package Assignment;

import java.util.Scanner;

public class StringDecode {
	public static void main(String[] args) {
		StringDecode object = new StringDecode();
		object.display();
	}

	private void display() {
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		String temp = "", result = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= '1' && word.charAt(i) <= '9') {
				result = temp;
				for (int j = 0; j < word.charAt(i) - 48; j++) {
					result += temp;
				}
				temp = result;
			} else {
				temp += word.charAt(i);
			}
		}
		System.out.println(result);
	}
}
