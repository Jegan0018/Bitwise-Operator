package Assignment;

import java.util.Scanner;

public class DoubleNumber {
	public static void main(String[] args) {
		int a,b;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		for(int i=1;i<b;i++,a=a*2);
		System.out.println(a);
	}
}
