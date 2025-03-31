
import java.util.Scanner;

class Input {

    public static void main(String[] args) {
        int marks[] = new int[100];
        System.out.println("Length of my array: " + marks.length);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        marks[0] = sc.nextInt(); // physics
        marks[1] = sc.nextInt(); // chemistry
        marks[2] = sc.nextInt(); // maths

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        float percentage = (marks[0] + marks[1] + marks[2]) / 3.0f;
        System.out.println(percentage);
    }

}
