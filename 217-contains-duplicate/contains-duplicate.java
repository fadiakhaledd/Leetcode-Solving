class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> freq = new HashSet<>();
        for (int val : nums) {
            if (freq.contains(val)) return true; 
            freq.add(val);
        }
        return false;
    }
}