package LeetcodeProblems;

public class ReverseChar {
	public static void main(String[] args) {
		String s= "Hellos World";
		String[] str = s.split(" ");
		int n = str.length;
		String sm = str[n-1].toString();
		System.out.println(sm.length());
	}
}
