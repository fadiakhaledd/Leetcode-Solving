class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0; 
        int expected = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            expected += i+1;
            sum += nums[i]; 
        }

        System.gc();

        return expected - sum; 
    }
}