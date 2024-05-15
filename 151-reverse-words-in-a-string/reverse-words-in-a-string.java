class Solution {
    public String reverseWords(String s) {
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            String word = "";

            while (j < s.length() && s.charAt(j) != ' ') {
                word += s.charAt(j);
                j++;
            }
            
            if (!word.isEmpty()) {
                word += " ";
                word += ans;
                ans = word;
            }

            i = j;
        }
        return ans.trim();
    }
}