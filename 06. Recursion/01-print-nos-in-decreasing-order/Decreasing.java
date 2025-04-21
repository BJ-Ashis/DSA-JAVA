class Decreasing {
    public static void descPrint(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        descPrint(n - 1);

    }

    public static void main(String[] args) {
        descPrint(10);
    }
}
