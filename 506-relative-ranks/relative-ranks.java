class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        int [] sorted = Arrays.copyOf(score, n); 
        Arrays.sort(sorted);
        String [] output = new String[n]; 
        for (int i = 0; i < n; i++) {
            int index = n - getIndex(sorted, score[i]); 
            if (index==1) output[i] = "Gold Medal"; 
            else if (index==2) output[i] = "Silver Medal"; 
            else if (index==3) output[i] = "Bronze Medal"; 
            else output[i] = Integer.toString(index); 
        }
        return output; 
    }

    public int getIndex(int[] numbers, int num) {
        int l = 0, r = numbers.length - 1;
        while (r >= l) {
            int mid = l + (r-l)/2; 
            if (numbers[mid] == num) return mid;
            else if (numbers[mid] > num) r = mid - 1; 
            else l = mid + 1; 
        }
        return -1; 
    }
}