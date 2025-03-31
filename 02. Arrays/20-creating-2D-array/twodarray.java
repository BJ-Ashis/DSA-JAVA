
import java.util.Scanner;

class twodarray {
    public static void search(int matrix[][], int target, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Element found at index: " + i + "," + j);
                    return;
                }
            }
        }
        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length;
        int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element to be searched");
        int target = sc.nextInt();
        search(matrix, target, n, m);

    }
}
