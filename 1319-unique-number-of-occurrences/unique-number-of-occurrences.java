class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> valuesCount = new HashMap(); 
        for (int num: arr) {
            valuesCount.put(num, valuesCount.getOrDefault(num,0)+1); 
        }

        int [] freq = new int [arr.length];

        for (Integer value : valuesCount.values()) {
            if (freq[value-1] != 0) return false; 
            freq[value-1] = 1; 
        }

        return true; 
    }
}