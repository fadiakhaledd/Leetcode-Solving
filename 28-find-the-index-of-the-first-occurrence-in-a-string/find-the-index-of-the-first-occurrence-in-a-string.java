class Solution {
    public int strStr(String haystack, String needle) {

        int nLen = needle.length();
        int hLen = haystack.length();

        for (int i = 0; i <= hLen-nLen; i++){
            int j = i; 
            int k = 0; 

            while(j-i < nLen && (haystack.charAt(j) == needle.charAt(k))) {
                k++;
                j++;
            }

            if (k == nLen) return i; 
        }

        return -1; 
    }
}