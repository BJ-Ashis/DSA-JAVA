class Counting {
    public static void countingSort(int arr[], int maxVal) {
        int n = arr.length;
        int count[] = new int[maxVal + 1]; // Array to store the count of elements

        // Step 1: Count the occurrences of each element
        for (int num : arr) {
            count[num]++;
        }

        // Step 2: Build the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        int maxVal = 5; // Maximum value in the array

        // Call the Counting Sort method
        countingSort(arr, maxVal);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}