package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPlusOne {
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int a[] = new int[number];
		for(int i=0;i<number;i++) {
			a[i] = scanner.nextInt(); 
		}
		a[a.length-1]++;
		for(int i=a.length-1;i>=0;i--) {
			a[i] = a[i] + count;
			if(a[i]>9) {
				a[i] = 0;
				count = 1;
				if(count == 1 && i == 0) {
					a = Arrays.copyOf(a, a.length+1);
					a[0] = 1;
					System.out.println(a[0]);
				}
			}
			else {
				count = 0;
			}
		}
		for (int i = 0; i <= number; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
