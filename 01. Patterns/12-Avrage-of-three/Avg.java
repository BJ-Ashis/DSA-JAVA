import java.util.Scanner;

class Ashis {  
    public double average(double x, double y, double z) {  
        return (x + y + z) / 3;
    }
}

public class Avg {
    public static void main(String[] args) {
        Ashis obj = new Ashis();  

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");  
        double x = sc.nextDouble();  
        System.out.print("Enter your second number: ");
        double y = sc.nextDouble();
        System.out.print("Enter your third number: ");
        double z = sc.nextDouble();
        
        System.out.println("Average is: " + obj.average(x, y, z));
    }
}
