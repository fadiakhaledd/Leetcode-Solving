class Solution {
    public String longestCommonPrefix(String[] strs) {
        String longest = strs[0];
        for (int i = 1; i < strs.length; i++){
            String word = strs[i];
            String common = "";
            for(int j = 0; j < longest.length() && j < word.length(); j++) {
                if(longest.charAt(j) == word.charAt(j)){
                    common += longest.charAt(j);
                } else {
                    break; 
                }
            }
            longest = common;
            
        }
        return longest;
    }
}