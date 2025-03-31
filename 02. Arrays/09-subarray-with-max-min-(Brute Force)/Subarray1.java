class Subarray1 {

    public static void printSubarrayMaxMin(int numbers[]) {
        int totalPairs = 0;
        int end = numbers.length;
        int storeSubarraySumCapacity = ((numbers.length) * (numbers.length + 1) / 2);
        int storeSubarraySum[] = new int[storeSubarraySumCapacity];
        int sum = 0;
        int subarrayIndex = 0;
        for (int i = 0; i < end; i++) {
            for (int j = i; j < end; j++) {
                System.out.print("(");
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("-" + numbers[k] + "-");
                    sum = sum + numbers[k];
                }
                System.out.print(")" + " " + "And Total Sum is :");
                storeSubarraySum[subarrayIndex] = sum;
                System.out.println(storeSubarraySum[subarrayIndex]);
                subarrayIndex++;
                totalPairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: " + totalPairs);
        largestAndSmallest(storeSubarraySum);
    }

    public static void largestAndSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("The Largest Number is: " + largest + "\nThe Smallest Number Is: " + smallest);

    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubarrayMaxMin(numbers);
    }

}
