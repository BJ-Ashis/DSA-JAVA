class BubbleSort {
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                System.out.println("Array is already sorted !!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        bubbleSort(nums);

        // Print the sorted array
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}