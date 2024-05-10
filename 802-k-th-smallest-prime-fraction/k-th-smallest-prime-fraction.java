class Solution {

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> fractions = getFractions(arr); 
        return fractions
        .stream()
        .sorted(Comparator.comparingDouble((fraction)-> (double)fraction[0]/fraction[1]))
        .toList()
        .get(k-1);
    }

    public List<int[]> getFractions(int[] arr) {
        int n = arr.length;
        List<int[]> fractionValues = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (j < n) {
                fractionValues.add(new int[]{arr[i], arr[j]});
                j++;
            }
        }
        return fractionValues;
    }

}