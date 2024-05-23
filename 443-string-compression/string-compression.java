class Solution {
    public int compress(char[] chars) {
        int i = 0, j = 0, k = 0; 
        int n = chars.length; 

        while (i < n) {
            int count = 0; 
            char lastChar = chars[i]; 
            while (j < n) {
                if (chars[i] != chars[j]){
                    lastChar = chars[j]; 
                    break; 
                }  
                count++; 
                j++; 
            }

            if (count > 1) {                
                for (char digit : String.valueOf(count).toCharArray()) {
                    chars[++k] = digit; 
                }
            } 

            k++; 
            if (k < n) {
                chars[k] = lastChar; 
            }
            
            i = j; 
        }

        return k; 
    }
}