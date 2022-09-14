package Practice;

public class UniqueStringDemo {
	public static void main(String[] args) {
		String s = "loveleetcode";
		for (int i = 0; i < s.length(); i++) {
			int visited = 0;
			for (int j = 0; j < s.length(); j++) {
				if (i != j) {
					if (s.charAt(i) == s.charAt(j)) {
						visited = 1;
						break;
					}
				}
			}
			if (visited == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
