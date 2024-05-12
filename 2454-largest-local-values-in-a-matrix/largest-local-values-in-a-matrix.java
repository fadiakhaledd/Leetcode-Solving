class Solution {
    public int[][] largestLocal(int[][] grid) {
        
        int gridSize = grid[0].length;
        int maxLocalSize = gridSize - 2; 
        int [][] maxLocal = new int [maxLocalSize][maxLocalSize];

        for (int i = 0; i < maxLocalSize; i++) {
            for (int j = 0; j < maxLocalSize; j++) {
                int max = Integer.MIN_VALUE;
                for (int row = i; row <= i+2; row++) {
                    for(int col = j; col <= j+2; col++) {
                        // System.out.print(grid[row][col] + " ");
                         max = Math.max(grid[row][col], max);
                    }
                    // System.out.println();
                } 
                // System.out.println();
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}