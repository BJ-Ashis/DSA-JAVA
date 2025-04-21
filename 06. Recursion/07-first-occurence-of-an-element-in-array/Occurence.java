class Occurence {
    public static int firstIndex(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == key) {
            return index;
        }
        return firstIndex(arr, key, index + 1);

    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 5;
        int index = 0;
        System.out.println(firstIndex(arr, key, index));
    }

}
