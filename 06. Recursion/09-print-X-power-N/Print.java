class Print {
    public static int printXPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        /*
         * int xnm1 = printXPowerN(x, n - 1);
         * int xn = x * xnm1;
         * return xn;
         */
        return x * printXPowerN(x, n - 1); 
    }

    public static void main(String[] args) {
        System.out.println(printXPowerN(2, 10));

    }

}
