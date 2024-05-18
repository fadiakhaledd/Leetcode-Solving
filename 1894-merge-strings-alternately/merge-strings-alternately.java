class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word = ""; 
        int word1Len = word1.length(), word2Len = word2.length(); 
        int i = 0; 
        while (i < word1Len || i < word2Len) {
          if (i < word1Len){
            word += word1.charAt(i); 
          }
          if (i < word2Len) {
            word += word2.charAt(i); 
          }
          i++; 
        }
        return word; 
    }
}