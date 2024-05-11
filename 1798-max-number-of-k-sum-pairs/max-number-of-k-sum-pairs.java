class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums); 
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;  

        for(int num : nums) {
            int target = k - num; 
            if (map.containsKey(target)){
                count++; 
                int target_count = map.get(target); 
                if (target_count == 1) map.remove(target);
                else map.put(target, target_count - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0)+1);
            }
        }
        
        return count; 
    }
}