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
		int[] array=new int[temp.length];
		int m=0;
		for(int j=temp.length-1;j>=0;j--) {
			array[m++]=temp[j];
		}
		int i=0,j=array.length-1;
		int visited = 0;
		while(i<j) {
			if(array[i]+array[j]<=limit) {
				array[j] += array[i];
				array[i] = visited;
				i++;
				j--;
			}
			else {
				i++;
			}
		}
	for(int k=0;k<array.length;k++) {
		if(array[k]!=visited) {
			count++;
		}
	}
	System.out.println(count);
}
}
