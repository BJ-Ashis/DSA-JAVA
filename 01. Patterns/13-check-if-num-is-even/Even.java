
import java.util.Scanner;

public class Even {
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (isEven(num)) {
            System.out.println(num + " is even number.");

        } else {
            System.out.println(num + " is odd number.");
        }

    }

}
