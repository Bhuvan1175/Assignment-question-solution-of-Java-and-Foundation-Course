//Q6 - Write a Java program to swap two numbers without help of a third variable.(HARD)
import java.util.Scanner;
public class sixSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int x = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int y = sc.nextInt();
        System.out.println("Before Swaping X : "+x);
        System.out.println("Before Swaping Y : "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After Swaping X : "+x);
        System.out.println("After Swaping Y : "+y);
        sc.close();

    }
}
