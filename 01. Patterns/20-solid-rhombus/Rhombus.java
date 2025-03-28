class Rhombus {

    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.err.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.err.print("*");
            }
            System.err.println(" ");
        }
    }

    public static void main(String[] args) {

        rhombus(8);

    }

}
