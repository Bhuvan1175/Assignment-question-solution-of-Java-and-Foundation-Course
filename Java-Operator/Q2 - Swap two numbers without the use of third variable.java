//Q2 - Swap two numbers without the use of third variable.
import java.util.Scanner;
public class swapNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of X :");
        int x = sc.nextInt();
        System.out.println("Enter The Value of Y :");
        int y = sc.nextInt();
        System.out.println("Before Swaping X : "+x);
        System.out.println("Before Swaping Y : "+y);
        // x=10;y=5;
        x=x+y;// x=15
        y=x-y;//y=15-5=10
        x=x-y;//x=15-10=5
        System.out.println("After Swaping X : "+x);
        System.out.println("After Swaping Y : "+y);
        sc.close();
    }
}
