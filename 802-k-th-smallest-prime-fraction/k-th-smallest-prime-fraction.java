class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> fractions = getFractions(arr); 
        List<Pair<int[], Float>> fractionValues = new ArrayList<>();
        for (int[] fraction : fractions) {
            float numerator = fraction[0];
            float denominator = fraction[1];
            float result = numerator / denominator;
            fractionValues.add(
                new Pair<int[], Float>(new int[]{fraction[0], fraction[1]}, result) );
        }

        Collections.sort(fractionValues, Comparator.comparing(Pair::getValue));

        Pair<int[], Float> ans = fractionValues.get(k-1);

        return ans.getKey();
    }

    public List<int[]> getFractions (int [] arr) {
        int n = arr.length; 
        List<int[]> fractions = new ArrayList<int[]>(); 
        for (int i = 0; i < n-1; i++) {
            int j = i + 1; 
            while (j < n) {
                fractions.add(new int[]{arr[i], arr[j]});
                j++; 
            }
        }
        return fractions; 
    }
}