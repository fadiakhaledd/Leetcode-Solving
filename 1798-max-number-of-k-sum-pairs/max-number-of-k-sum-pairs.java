class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;  

        for(int num : nums) {
            int target = k - num; 
            int target_count = map.getOrDefault(target, 0);
            if (target_count > 0) {
                count++; 
                map.put(target, target_count - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        
        return count; 
    }
}