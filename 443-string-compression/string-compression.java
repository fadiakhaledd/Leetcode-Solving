class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0, k = 0;
        int n = chars.length;
        while (i < n) {
            int count = 0;
            char currentChar = chars[i];
            while (j < n && chars[i] == chars[j]) {
                count++;
                j++;
            }

            chars[k++] = currentChar;

            if (count > 1) {
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[k++] = digit;
                }
            }

            i = j;
        }

        return k;
    }
}