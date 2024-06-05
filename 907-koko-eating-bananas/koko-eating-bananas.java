class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int minSpeed = 1;
        int maxSpeed = 0; 

        for (int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }
        
        while (maxSpeed > minSpeed) {
            int mid = minSpeed + (maxSpeed - minSpeed) / 2;
            if (canFinishEating(piles, mid, h)) 
                maxSpeed = mid;
            else
                minSpeed = mid + 1;
        }
        return minSpeed;
    }

    boolean canFinishEating(int piles[], int speed, int hours) {
        int totalHours = 0;
        for (int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }
        return totalHours <= hours;
    }

}