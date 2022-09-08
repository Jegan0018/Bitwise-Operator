package ArraysDemo;

import java.util.ArrayList;
import java.util.List;

public class ArraySplit {
	public static void main(String[] args) {
		int[] array = {49,36,8,10,12};
		int[] sum = new int[array.length];
		double sqrt;
		for(int i=0;i<array.length;i++) {
			sqrt = Math.sqrt(array[i]);
			if(sqrt == (int)sqrt) {
				sum[i] += 5;
			}
			if(array[i] % 4 == 0 && array[i] % 6 == 0) {
				sum[i] += 4;
			}
			if(array[i]%2 == 0) {
				sum[i] += 3;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(sum[i]<sum[j]) {
					int temp1 = sum[i];
					sum[i] = sum[j];
					sum[j] = temp1;
					int temp2 = array[i];
					array[i] = array[j];
					array[j] = temp2;
				}
			}
		}
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+" "+sum[i]);
		}
	}
}
