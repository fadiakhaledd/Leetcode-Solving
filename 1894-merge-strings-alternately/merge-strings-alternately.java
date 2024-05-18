class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word = ""; 
        int word1Len = word1.length(), word2Len = word2.length(); 
        int minLen = Math.min(word1Len,word2Len);
        for (int i = 0; i < minLen;i++) {
            word += word1.charAt(i); 
            word += word2.charAt(i); 
            word1Len--; 
            word2Len--; 
        }
        while(word1Len != 0) {
            word+= word1.charAt(word1.length()-word1Len);
            word1Len--;
        }
        while(word2Len != 0) {
            word+= word2.charAt(word2.length()-word2Len);
            word2Len--; 
        }
        return word; 
    }
}