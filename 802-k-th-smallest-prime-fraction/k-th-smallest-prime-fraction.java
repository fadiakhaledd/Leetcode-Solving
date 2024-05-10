class Solution {
    
    class Fraction {
        int[] fraction;
        float value;

        Fraction(int numerator, int denominator) {
            this.fraction = new int[]{numerator, denominator};
            this.value = (float) numerator / denominator;
        }
    }

    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<Fraction> fractionValues = getFractions(arr);
        fractionValues.sort(Comparator.comparingDouble(fr -> fr.value));
        return fractionValues.get(k-1).fraction;
    }

    public  List<Fraction> getFractions (int [] arr) {
        int n = arr.length; 
        List<Fraction> fractionValues = new ArrayList<>();
        for (int i = 0; i < n-1; i++) {
            int j = i + 1; 
            while (j < n) {
                fractionValues.add(new Fraction(arr[i], arr[j]));
                j++; 
            }
        }
        return fractionValues; 
    }

}