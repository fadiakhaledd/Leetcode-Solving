class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int maxCount = 0; 
        unordered_set<char> ust; 

        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (!ust.count(s[j]) && j < s.length()) {
                ust.insert(s[j]);
                j++; 
            }
            int count = ust.size();
            maxCount = max(maxCount, count);
            ust.clear();
        } 
        return maxCount; 
    }
};