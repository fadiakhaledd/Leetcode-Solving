class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) return 0;
        int ans = 1; 
        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i-1]) {
                current ++;
            } else {
                ans = Math.max(ans, current);
                current = 1;
            }
        }
        return Math.max(ans, current); 
    }
}