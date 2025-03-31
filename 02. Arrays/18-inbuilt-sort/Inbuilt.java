import java.util.Arrays;

class Inbuilt {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        // Use inbuilt sort method to sort the array
        Arrays.sort(arr);

        // Print the sorted array
        System.out.print("Sorted array using inbuilt method: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}