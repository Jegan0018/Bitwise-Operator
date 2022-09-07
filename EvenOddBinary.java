package Practice;

import java.util.Scanner;

public class EvenOddBinary {
	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if((x & 1) == 0){
		    System.out.println("Number is even");
		}
		else{
		    System.out.println("Number is odd");
		}
		sc.close();
	}
}
