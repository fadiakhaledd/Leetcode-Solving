class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int [] count = new int [limit + 1]; 
        for (int num : people) {
            count[num]++;
        }

        int ans = 0; 
        for (int num: people) {
            if (count[num] > 0) {
                ans++; 
                count[num]--; 

                int remaining = limit - num; 
                while(remaining > 0 && count[remaining] <= 0) {
                    remaining--; 
                }

                if (remaining != 0) {
                    count[remaining]--; 
                }
            }
        }
        return ans; 
    }
}