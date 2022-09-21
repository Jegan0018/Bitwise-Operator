package LeetcodeProblems;

public class LongestSubstring {
	public static void main(String[] args) {
		String s= "aaabc";
		int length = s.length();
        int count = 0;
        for(int i=0;i<length;i++) {
            for(int j=i+1;j<length;j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
	}
}
