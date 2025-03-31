class Diagonal {
    public static void diagonal(int matrix[][]) {
        // both N & M are same for this type of question
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns
        int sum = 0;

        /*
         * for (int i = 0; i < n; i++) {
         * for (int j = 0; j < m; j++) {
         * // primary diagonal index are (i == j)
         * if (i == j) {
         * sum += matrix[i][j];
         * }
         * // secondary diagonal index are (i + j == 3)
         * 
         * if (i + j == n) {
         * sum += matrix[i][j];
         * }
         * }
         * }
         */

        // i + j == n-1 so j = n - 1 - i

        for (int i = 0; i < n; i++) {
            // pd
            sum += matrix[i][i];
            // sd
            if (i != n - 1 - i) {
                sum += matrix[i][n - 1 - i];
            }
        }

        System.out.println(sum);

    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        diagonal(matrix);
    }
}
