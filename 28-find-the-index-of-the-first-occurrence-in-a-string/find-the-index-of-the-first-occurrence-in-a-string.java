class Solution {
    public int strStr(String haystack, String needle) {
        int nLen = needle.length();
        int hLen = haystack.length();
        for (int i = 0, j = i; i <= hLen-nLen; i++, j++){
            int k = 0; 
            while(j-i < nLen) {
                System.out.println(i + " " + j + " " + k);
                if(haystack.charAt(j) == needle.charAt(k)) {
                    k++;
                    j++;
                } else {
                    j = i;
                    break; 
                }
            }
            if (k == nLen) return i; 
        }
        return -1; 
    }
}