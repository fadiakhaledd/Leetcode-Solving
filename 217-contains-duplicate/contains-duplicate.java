class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> freq = new HashSet<>();
        for (int val : nums) {
            if (!freq.add(val)) return true; 
        }
        return false;
    }
}