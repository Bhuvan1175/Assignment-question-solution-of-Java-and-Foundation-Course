// Que 8:- Find the sum of digit in a given number.
import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number :");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num /= 10;
            sum += rem;
        }
        System.out.println("Sum of Digit of " + temp + " is = " + sum);
        sc.close();
    }
}
