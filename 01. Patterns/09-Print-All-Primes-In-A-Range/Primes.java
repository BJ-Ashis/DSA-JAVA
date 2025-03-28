class Primes {
    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n == 2) {
                return true;

            }
            if (n % i == 0) {
                return false;
            }

        }
        return true;
    }

    public static void primesInRange(int n) {
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }

        }
    }

    public static void main(String[] args) {
        primesInRange(20);
    }

}
