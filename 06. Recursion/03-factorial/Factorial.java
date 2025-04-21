class Factorial {
    public static int factorialN(int n) {
        int fact = 1;
        if (n == 1 || n == 0) {
            return fact;
        }
        fact = n * factorialN(n - 1);
        return fact;

    }

    public static void main(String[] args) {
        System.out.println(factorialN(1));

    }

}

