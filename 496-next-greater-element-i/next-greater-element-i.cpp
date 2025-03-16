class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans(nums1.size(), -1);
        unordered_map<int, int> nextG;
        stack<int> monoStack; 

        for (int i =nums2.size() -1;i >= 0; i--) {
            while (!monoStack.empty() && nums2[i] >= monoStack.top()) {
                monoStack.pop();
            }

            if (!monoStack.empty()) {
                nextG[nums2[i]] = monoStack.top(); 
            } else {
                nextG[nums2[i]] = -1; 
            }

            monoStack.push(nums2[i]);
        }

        for (int i = 0; i < nums1.size(); i++) {
            ans[i] = nextG[nums1[i]]; 
        }
        return ans;
    }

    
};