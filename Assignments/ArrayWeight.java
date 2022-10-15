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
		int[] temp = new int[length];
		System.out.println("Enter Array");
		for (int i = 0; i < length; i++) {
			temp[i] = scanner.nextInt();
		}
		System.out.println("Enter Limit");
		int limit = scanner.nextInt();
		int count = 0, sum = 0;
		Arrays.sort(temp);
		int[] array = new int[temp.length];
		int tempIndex = 0;
		for (int index = temp.length - 1; index >= 0; index--) {
			array[tempIndex++] = temp[index];
		}
		int startIndex = 0, endIndex = array.length - 1;
		int visited = 0;
		while (startIndex < endIndex) {
			if (array[startIndex] + array[endIndex] <= limit) {
				array[endIndex] += array[startIndex];
				array[startIndex] = visited;
				startIndex++;
				endIndex--;
			} else {
				startIndex++;
			}

		}
		for (int index = 0; index < array.length; index++) {
			if (array[index] != visited) {
				count++;
			}
		}
		System.out.println(count);
	}
}
