class Optimized {
    public static int optimizedPower(int a, int n) {

        if (n == 0) {
            return 1;
        }

        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        if (n % 2 == 0) {
            return halfPowerSq;
        } else {
            return a * halfPowerSq;
        }

    }

    public static void main(String[] args) {
        int a = 2;
        int n = 5;
        System.out.println(optimizedPower(a, n));
    }

}
