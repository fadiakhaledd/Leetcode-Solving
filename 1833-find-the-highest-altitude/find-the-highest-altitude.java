class Solution {
    public int largestAltitude(int[] gain) {
        int highest = 0;
        int [] prefixSum = new int[gain.length+1]; 
        prefixSum[0] = 0; 
        for (int i = 1; i <= gain.length; i++) {
            prefixSum[i] = prefixSum[i-1] + gain[i-1]; 
            highest = Math.max(highest, prefixSum[i]);
        }
        return highest; 
    }
}