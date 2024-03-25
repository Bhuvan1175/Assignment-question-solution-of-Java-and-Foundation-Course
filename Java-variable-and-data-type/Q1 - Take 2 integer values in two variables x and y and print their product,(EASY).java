// Q1 - Take 2 integer values in two variables x and y and print their product.(EASY)
import java.util.Scanner;

public class firstQueProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        System.out.println("Enter the value of y :");
        int y = sc.nextInt();
        int Product = x * y;
        System.out.println("Product of " + x + " And " + y + " is = " + Product);
        sc.close();
    }
}
