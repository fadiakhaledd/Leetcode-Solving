class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxCount = 0; 

        for (int i = 0; i < s.length(); i++) {
            unordered_set<char> ust; 
            int j = i;
            while (!ust.count(s[j]) && j < s.length()) {
                ust.insert(s[j]);
                j++; 
            }
            int count = ust.size();
            maxCount = max(maxCount, count);
        } 
        return maxCount; 
    }
};