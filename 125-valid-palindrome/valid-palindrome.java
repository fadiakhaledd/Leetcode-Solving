class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (j > i) {
             char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);

            if (!Character.isLetterOrDigit(leftChar)) {
                i++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                j--;
            } else {
                if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}