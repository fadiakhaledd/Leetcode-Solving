class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A','E', 'O', 'I', 'U'));
        char[] ch = s.toCharArray();
        while (i < j) {
            if (VOWELS.contains(ch[i]) && VOWELS.contains(ch[j])) {
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++; 
                j--; 
            }
            while(i < j && !VOWELS.contains(ch[i])) i++; 
            while(i < j && !VOWELS.contains(ch[j])) j--; 
        }
        return new String(ch);
    }
}