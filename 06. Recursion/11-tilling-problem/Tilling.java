/*
 * given a "2 x n" board and tiles of size "2 x 1", count the number of ways to tile the given board using the given tiles.
 * (A tile can either be placed horizontally or vertically.)
 */
class Tilling {
    public static int tilingProblem(int n) { // 2 x n board, 2 x 1 tiles
        
        if (n == 0 || n == 1) {
            return 1;
        }

        /*
         * // kaam
         * // vertical choice
         * int fnm1 = tilingProblem(n - 1);
         * 
         * // horizontal choice
         * int fnm2 = tilingProblem(n - 2);
         * 
         * int totWays = fnm1 + fnm2;
         * 
         * return totWays;
         * 
         */

        return tilingProblem(n - 1) + tilingProblem(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(3));

    }
}
