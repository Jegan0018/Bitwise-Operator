package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWeight {
	public static void main(String[] args) {
		ArrayWeight object = new ArrayWeight();
		object.display();
	}

	private void display() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Length");
		int length = scanner.nextInt();
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}
		int limit = scanner.nextInt();
		int count = 0, sum = 0;
		Arrays.sort(array);
		for (int i = 0; i < length; i++) {
			sum = sum + array[i];
			if (sum <= limit) {
				continue;
			} else {
				count++;
				sum = array[i];
			}
		}
		if (sum != 0)
			count++;
		System.out.println(count);
	}
}
