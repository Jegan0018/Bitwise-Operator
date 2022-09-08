package ArraysDemo;

import java.util.Scanner;

public class GrandChild {
	public static void main(String[] args) {
		String[][] family = { { "Luke", "Shaw" }, { "Wayne", "Rooney" }, { "Rooney", "Ronaldo" },
				{ "Shaw", "Rooney" } };
		String grandFather;
		Scanner scanner = new Scanner(System.in);
		grandFather = scanner.next();
		String father = "";
		int j = 1;
		for (int i = 0; i < family.length; i++) {
			if (family[i][j].equals(grandFather)) {
				father = family[i][j - 1];
			}
		}
		int grandChild = 0;
		for (int i = 0; i < family.length; i++) {
			if (family[i][j].equals(father)) {
				grandChild++;
			}
		}
		System.out.println(grandChild);
	}
}
