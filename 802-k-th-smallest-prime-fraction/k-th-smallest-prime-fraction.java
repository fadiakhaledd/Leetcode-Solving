class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        
        List<Pair<int[], Float>> fractionValues = getFractions(arr);
        Collections.sort(fractionValues, Comparator.comparing(Pair::getValue));
        return fractionValues.get(k-1).getKey();
    }

    public  List<Pair<int[], Float>> getFractions (int [] arr) {
        int n = arr.length; 
        List<Pair<int[], Float>> fractionValues = new ArrayList<>();

        for (int i = 0; i < n-1; i++) {
            int j = i + 1; 
            float numerator = arr[i]; 
            while (j < n) {
                float denominator = arr[j];
                float result = (float) numerator / denominator;;
                fractionValues.add(
                new Pair<int[], Float>(new int[]{arr[i], arr[j]}, result));
                j++; 
            }
        }
        return fractionValues; 
    }
}