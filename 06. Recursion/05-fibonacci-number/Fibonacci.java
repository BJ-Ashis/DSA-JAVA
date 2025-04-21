class Fibonacci {
    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void printFibo(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) { 
        printFibo(9);
    }
}
