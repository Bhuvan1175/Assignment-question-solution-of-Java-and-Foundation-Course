
//Q3 - Write a Java program to take the length and breadth of a rectangle and print its area.(EASY)
import java.util.Scanner;

public class thirdQueArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The length :");
        double l = sc.nextDouble();
        System.out.println("Enter The Breadth :");
        double B = sc.nextDouble();
        double Area = l * B;
        System.out.println("The Area Of Rectangle Is " + Area);
        sc.close();

    }
}
