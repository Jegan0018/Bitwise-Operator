package ArraysDemo;

import java.util.Arrays;

public class ArrayRotate2 {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5 };
		int k = 2;
		int a[] = new int[nums.length];
		int index = nums.length - k;
		for (int j = 0; j < nums.length; j++) {
			a[j] = nums[index];
			index++;
			if (index == nums.length) {
				index = 0;
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
