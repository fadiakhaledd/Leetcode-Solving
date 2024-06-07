class Solution {
    public int maxVowels(String s, int k) {
        int maxLength = 0;

        Set<Character> vowels = new HashSet<>();
        Collections.addAll(vowels, 'a', 'e', 'i', 'o', 'u');

        for(int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                maxLength++;
            }
        }

        int temp = maxLength;
        for (int j = k; j < s.length(); j++) {
            
            if (vowels.contains(s.charAt(j - k))) {
                temp--;
            }

            if (vowels.contains(s.charAt(j))) {
                temp++;
            }
            maxLength = Math.max(maxLength, temp);

        }

        return maxLength;
    }
}