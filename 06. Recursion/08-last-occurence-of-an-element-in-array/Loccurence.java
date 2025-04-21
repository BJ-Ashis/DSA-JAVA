class Loccurence {
    public static int lastIndex(int arr[], int key, int index) {
        if (index == arr.length) {
            return -1;
        }
        int isFound = lastIndex(arr, key, index + 1);
        if (isFound == -1 && arr[index] == key) {
            return index;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3, 5, 5 };
        System.out.println(lastIndex(arr, 5, 0));
    }

}
