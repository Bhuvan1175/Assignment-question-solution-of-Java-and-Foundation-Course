
// Que 07 : Count the number of digit for a give number n.
import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  any number:");
        int num = sc.nextInt();
        int temp=num;
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        System.out.println("Number of digit in " + temp + " is : " + count);
        sc.close();
    }
}
