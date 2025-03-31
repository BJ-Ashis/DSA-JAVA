class Largest {
    public static int getLargest(int numbers[]) {
        int larg = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > larg) {
                larg = numbers[i];
            }
            if (small > numbers[i]) {
                small = numbers[i];
            }
        }
        System.out.println("Smallest Value Is:" + small);
        return larg;
    }

    public static void main(String[] args) {
        int numbers[] = { 8, 1, 2, 3, 4, 5 };
        int larg = getLargest(numbers);
        System.out.println("Largest Value Is:" + larg);
    }

}
