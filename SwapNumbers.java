package Practice;

import java.util.Scanner;

public class SwapNumbers {
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b= scanner.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}
}
