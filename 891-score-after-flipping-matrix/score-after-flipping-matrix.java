class Solution {
    public int matrixScore(int[][] grid) {
        int rowsLen = grid.length;
        int colsLen = grid[0].length;
        int maxSum = Integer.MIN_VALUE;

        // loop through rows, toggle each and check if toggled is greater, repalce it
        for (int i = 0; i < rowsLen; i++) {
            int[] row = grid[i];
            if (isToggledGreater(row)) {
                toggleArray(row);
                grid[i] = row;
            }
        }

        maxSum = calculateSum(grid);

        // loop through coloums, toggle each, check if the total sum after toggling is
        // greater, replace column
        for (int i = 0; i < colsLen; i++) {
            int[] column = extractColumn(grid, i);
            toggleArray(column);

            for (int k = 0; k < rowsLen; k++) {
                grid[k][i] = column[k];
            } 

            int currentSum = calculateSum(grid);

            if (maxSum < currentSum) {
                maxSum = currentSum;
            } else {
                toggleArray(column);
                for (int k = 0; k < rowsLen; k++) {
                    grid[k][i] = column[k];
                }
            }
        }
        return maxSum;
    }

    private int calculateSum(int grid[][]) {
        int sum = 0;
        int n = grid[0].length;

        for (int[] row : grid) {
            for (int i = 0; i < n; i++) {
                sum += (row[i] << (n- i - 1));
            }
        }
        return sum;
    }

    private boolean isToggledGreater(int[] array) {
        int decimal = 0;
        int toggledDecimal = 0;
        int n = array.length;
        for (int i = 0; i < n; i++) {
            decimal += (array[i] << (n - i - 1));
            toggledDecimal += ((array[i] ^ 1) << (n - i - 1));
        }
        return toggledDecimal > decimal;
    }

    private int[] extractColumn(int[][] grid, int index) {
        int[] column = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            column[i] = grid[i][index];
        }
        return column;
    }

    private void toggleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] ^ 1;
        }
    }
}