class Solution {
    public int matrixScore(int[][] grid) {
        int rowsLen = grid.length;
        int colsLen = grid[0].length;
        int maxSum = Integer.MIN_VALUE;

        // loop through rows, toggle each and check if toggled is greater, repalce it
        for (int i = 0; i < rowsLen; i++) {
            int[] row = grid[i];
            int[] rowCopy = Arrays.copyOf(row, colsLen);
            toggleArray(rowCopy);
            if (isToggledGreater(row, rowCopy))
                grid[i] = rowCopy;
        }

        maxSum = calculateSum(grid); 

        // loop through coloums, toggle each, check if the total sum after toggling is greater, replace column 
        for (int i = 0; i < colsLen; i++) {
            int[] column = extractColumn(grid, i);
            int[] columnCopy = Arrays.copyOf(column, rowsLen);
            toggleArray(columnCopy);
            int[][] gridCopy = new int[rowsLen][];

            for (int k = 0; k < rowsLen; k++) {
                gridCopy[k] = Arrays.copyOf(grid[k], colsLen);
            }

            for (int k = 0; k < rowsLen; k++) {
                gridCopy[k][i] = columnCopy[k];
            }

            int currentSum = calculateSum(gridCopy);

            if (maxSum < currentSum) {
                for (int k = 0; k < rowsLen; k++) {
                    grid[k][i] = columnCopy[k];
                }
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    private int calculateSum(int grid[][]) {
        int sum = 0;
        for (int[] row : grid) {
            String binaryString = Arrays.toString(row).replaceAll("[\\[\\] ,]", "");
            sum += Integer.parseInt(binaryString, 2);
        }
        return sum;
    }

    private Boolean isToggledGreater(int[] row, int[] rowCopy) {
        String binaryString = Arrays.toString(row).replaceAll("[\\[\\] ,]", "");
        int decimal = Integer.parseInt(binaryString, 2);

        String toggledBinaryString = Arrays.toString(rowCopy).replaceAll("[\\[\\] ,]", "");
        int toggledDecimal = Integer.parseInt(toggledBinaryString, 2);

        return toggledDecimal > decimal;
    }

    private int[] extractColumn(int[][] grid, int index) {
        return Arrays.stream(grid)
                .mapToInt(row -> row[index])
                .toArray();
    }

    private void toggleArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] ^ 1;
        }
    }
}