class Butterfly {
    public static void butterfly(int n) {

        // upper half
        for (int i = 1; i <= n; i++) {

            // first triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // second triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // lower half
        for (int i = n - 1; i >= 1; i--) {

            // first triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // second triangle
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void main(String[] args) {
        butterfly(5);

    }
}
