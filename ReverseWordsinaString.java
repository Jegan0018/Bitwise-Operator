class Solution {
    public String reverseWords(String s) {
        s=s.replaceAll("\\s+"," ").trim();
        String[] str = s.split(" ");
        String sm = "";
		for(int i=str.length-1;i>=0;i--) {
            if(i==0) {
                sm += str[i];
            }
            else {
                sm += str[i].trim()+" ";
            }
        }
        return sm;
    }
}
