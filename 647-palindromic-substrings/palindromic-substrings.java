class Solution {
    public int countSubstrings(String s) {
        ArrayList<String> substrings = generate_substrings(s);
        int ans = 0;
        for (String substring : substrings) {
            if (isPalidnromic(substring)) ans++;
        }
        return ans;
    }
    public boolean isPalidnromic(String s) {
        int n = s.length();
        for (int i = 0, j = n- 1; i < n; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false; 
        }
        return true; 
    }
    public ArrayList<String> generate_substrings (String s) {
        int n  = s.length();
        ArrayList<String> substrings = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String subStr="";
            for (int j = i; j < n; j++) {
                subStr += s.charAt(j);
                substrings.add(subStr);
            }
        }
        return substrings; 
    }
}