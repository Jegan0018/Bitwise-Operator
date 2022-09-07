package Assignment;

import java.math.BigInteger;

public class ChessBoard {
	public static void main(String[] args) {		
		BigInteger value = new BigInteger("1");
		for (int i=0; i<64; i++,value = value.add(value));
		System.out.println(value);
	}
}
