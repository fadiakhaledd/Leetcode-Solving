class Solution {
    public int findDuplicate(int[] nums) {
        int [] freqArray = new int [nums.length]; 
        for (int num : nums) {
            if (freqArray[num] > 0) return num; 
            else freqArray[num]++; 
        }
        return 0;
    }
}