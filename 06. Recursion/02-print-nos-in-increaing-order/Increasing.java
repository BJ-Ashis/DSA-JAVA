class Increasing {
    public static void incrPrint(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        incrPrint(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        incrPrint(10);
    }
}
