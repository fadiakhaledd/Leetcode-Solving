class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length; 
        int sum = 0; 
        int expected = len * ( len + 1) /2;
        
        for (int num : nums) {
            sum += num; 
        }

        return expected - sum; 
    }
}