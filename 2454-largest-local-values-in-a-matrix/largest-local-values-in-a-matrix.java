class Solution {
    public int[][] largestLocal(int[][] grid) {
        int gridSize = grid[0].length;
        int maxLocalSize = gridSize - 2; 
        int [][] maxLocal = new int [maxLocalSize][maxLocalSize];
        for (int i = 0; i < maxLocalSize; i++) {
            for (int j = 0; j < maxLocalSize; j++) {
                int startRow = i, endRow = i+2; 
                int startCol = j, endCol = j+2; 
                for (int row = startRow; row <= endRow; row++) {
                    for(int col = startCol; col <= endCol; col++) {
                        // System.out.print(grid[row][col] + " ");
                         maxLocal[i][j] = Math.max(grid[row][col], maxLocal[i][j]);
                    }
                    // System.out.println();
                } 
                // System.out.println();
            }
        }
        return maxLocal;
    }
}