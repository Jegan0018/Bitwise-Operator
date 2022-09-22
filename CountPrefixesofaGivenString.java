class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(int i=0;i<words.length;i++) {
            if(s.indexOf(words[i])== 0) {
                count++;
            }
        }
        return count;
    }
}
