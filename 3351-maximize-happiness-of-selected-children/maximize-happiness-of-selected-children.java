class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness); 
        int n = happiness.length;
        long sum = 0; 
        int kCopy = k; 
        for (int i = n-1; i >= n-k; i--) {
            int currentHappiness =  happiness[i] - (k-kCopy); 
            if (kCopy > 0 && currentHappiness >= 0) {
                    sum += currentHappiness;
                    kCopy--; 
            }
        }
        return sum; 
    }
}