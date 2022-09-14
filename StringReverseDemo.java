package Practice;

public class StringReverseDemo {
	public static void main(String[] args) {
		String s="abcac";
		String str = "";
		for(char c:s.toCharArray()) {
			if(s.contains(String.valueOf(c))) {
				System.out.println(c);
				break;
			}
			str += c;
		}
	}
}
