package Assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MathGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int target = scanner.nextInt();
		char[] operator = { '+', '-', '*', '/' };

		int numbers[] = new int[4];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers);
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < numbers.length - 3; i++) {
			for (int j = i + 1; j < numbers.length - 2; j++) {
//				for (int m = 0; m < operator.length-2; m++) {
//					for (int n = 0; n < operator.length-1; m++) {
				int k = j + 1;
				int l = numbers.length - 1;
				while (k < l) {
					int result = 0;
					result = numbers[i] + numbers[j] + numbers[k] + numbers[l];
					System.out.println(result);
					if (result == target) {
						list.add(Arrays.asList(numbers[i], numbers[j], numbers[k], numbers[l]));
						l--;
						k++;
					} else if (result < target) {
						k++;
					} else {
						l--;
					}
//					}
//					}
				}
			}
		}
		System.out.println(list);
	}
}
