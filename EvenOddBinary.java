package Practice;

import java.util.Scanner;

public class EvenOddBinary {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if((a & 1) == 0){
            System.out.println("it is even");
        }
        else{
            System.out.println("it is odd");
        }
		sc.close();
	}
}
