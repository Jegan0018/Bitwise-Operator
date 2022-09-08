package ArraysDemo;

import java.util.Arrays;
import java.util.Collections;

public class RearrangeArray {
	public static void main(String[] args) {
		int array1[] = { 1, 2,1,4,5,6,8,8 };
		int array2[] = new int[array1.length];
		Arrays.sort(array1);
		int length = array1.length;
		int i = 0, j = length - 1, k = 0;
		if (length % 2 == 0) {
			while (i < j) {
				array2[k++] = array1[j--];
				array2[k++] = array1[i++];
			}
		} else {
			while (i < j) {
				array2[k++] = array1[i++];
				array2[k++] = array1[j--];
			}
		}
		if (length % 2 != 0) {
			array2[k++] = array1[i];
		}
		for (i = array2.length - 1; i >= 0; i--) {
			System.out.print(array2[i] + " ");
		}
	}
}
