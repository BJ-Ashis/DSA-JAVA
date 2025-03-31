class Spiral {
    public static void spiral(int matrix[][]) {
        // Check if the matrix is null or empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty or invalid.");
            return;
        }

        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        int startRow = 0;
        int endRow = n - 1;
        int startCol = 0;
        int endCol = m - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int i = startCol; i <= endCol; i++) {
                System.out.print(matrix[startRow][i] + " ");
            }
            startRow++;

            // Right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Bottom row (if still valid)
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    System.out.print(matrix[endRow][i] + " ");
                }
                endRow--;
            }

            // Left column (if still valid)
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String[] args) {
        // Test with a normal matrix
        int matrix1[][] = { 
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } 
        };
        System.out.println("Matrix 1:");
        spiral(matrix1);

        // Test with a single row
        int matrix2[][] = { { 1, 2, 3, 4 } };
        System.out.println("\n\nMatrix 2:");
        spiral(matrix2);

        // Test with a single column
        int matrix3[][] = { 
                { 1 }, 
                { 2 }, 
                { 3 }, 
                { 4 } 
        };
        System.out.println("\n\nMatrix 3:");
        spiral(matrix3);

        // Test with an empty matrix
        int matrix4[][] = {};
        System.out.println("\n\nMatrix 4:");
        spiral(matrix4);
    }
}