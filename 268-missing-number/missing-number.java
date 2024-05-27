class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0; 
        
        for (int num: nums) {
            sum += num; 
        }

        int len = nums.length; 

        return (len*(len+1)/2) - sum; 
    }
}