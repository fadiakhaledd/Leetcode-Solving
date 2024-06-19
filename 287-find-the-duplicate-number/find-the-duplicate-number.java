class Solution {
    public int findDuplicate(int[] nums) {
        boolean [] freqArray = new boolean [nums.length]; 
        for (int num : nums) {
            if (freqArray[num]) return num; 
            else freqArray[num] = true; 
        }
        return 0;
    }
}