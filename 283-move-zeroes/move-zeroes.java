class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length; 
        int i = 0, j = 0; 
        for (; i < n; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i]; 
                j++; 
            }
        }

        while (j < n) {
            nums[j] = 0; 
            j++;
        }  
        System.out.print(Arrays.toString(nums)); 

    }  

}