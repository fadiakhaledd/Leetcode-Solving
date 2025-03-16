class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> ans(nums1.size(), 0);
        unordered_map<int, int> numIndex;

        for (int i = 0; i < nums1.size(); i++) {
            int j = 0;
            while (nums1[i] != nums2[j]) {
                j++;
            }
            numIndex[nums1[i]] = j;
        }

        for (int i = 0; i < nums1.size(); i++) {
            int number = nums1[i];
            ans[i] =  findGreaterElement(number, numIndex[number], nums2);
        }

        return ans;
    }

    int findGreaterElement(int number, int index, vector<int>& nums) {
        for (int i = index+1; i < nums.size(); i++) {
            if (nums[i] > number) {
                return nums[i];
            }
        }
        return -1; 
    }
};