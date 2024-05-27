class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length; 
        int [] freq = new int [len+1]; 
        for (int num:nums) {
          freq[num]++; 
        }

        for (int i = 0; i <= len; i++){
            if (freq[i]==0) return i; 
        }

        return nums.length; 
    }
}