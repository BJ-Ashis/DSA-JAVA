class Subarray2 {

    public static void prefixSubarrayMaxMin(int number[]) {
        int prefix[] = new int[number.length];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum;

        prefix[0] = number[0];
        for (int p = 1; p < number.length; p++) {
            prefix[p] = prefix[p - 1] + number[p];
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = i; j < number.length; j++) {
                sum = prefix[j] - (i > 0 ? prefix[i - 1] : 0);
                if (sum > max) {
                    max = sum;
                }
                if (min > sum) {
                    min = sum;
                }
            }
        }
        System.out.println("The largest sum is: " + max + " The smallest sum is: " + min);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        prefixSubarrayMaxMin(numbers);
    }
}
