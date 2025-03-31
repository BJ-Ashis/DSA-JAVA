class Numbers {
    public static boolean distinctNumber(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 4 };
        boolean test = distinctNumber(numbers);
        if (test) {
            System.out.println("Distinct values");
        } else {
            System.out.println("Values appears twice");
        }
    }
}
