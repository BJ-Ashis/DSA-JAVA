class Pairs {
    public static void printPairs(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                tp++;
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
            }
            System.out.println();

        }
        System.out.println("Total Pairs:" + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printPairs(numbers);

    }
}
