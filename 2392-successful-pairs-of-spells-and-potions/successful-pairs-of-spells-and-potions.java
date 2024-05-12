class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int [] pairs = new int[n];
        Arrays.sort(potions); 
        for (int i = 0; i < n; i++) {
            long target = success / spells[i] + (success % spells[i] != 0 ? 1 : 0);
            int index = getIndex(potions, target);
            if (index == -1) pairs[i] = 0; 
            else pairs[i] = potions.length - index;  
        }
        return pairs;
    }

    public int getIndex (int [] potions, long target) {
        int low = 0, high = potions.length-1; 
        int index = -1; 
        while (low <= high) {
            int mid = low + (high-low)/2; 
             if (target <= potions[mid]) {
                // Update index but continue searching for earlier occurrences
                index = mid; 
                high = mid - 1; 
            } else low = mid + 1; 
        }
        return index; 
    } 
}