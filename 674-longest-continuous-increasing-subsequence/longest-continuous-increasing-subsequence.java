class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int ans = 1; 
        for (int i = 0, j = i + 1; i < nums.length - 1; i++, j++) {
            int current = 1;
            while (j < nums.length && nums[j] > nums[j-1]) {
                current++;
                j++;
            } 

            ans = Math.max(ans, current);
            int remaining = nums.length - ans; 
            if (ans > remaining) return ans; 
        }
        return ans; 
    }
}