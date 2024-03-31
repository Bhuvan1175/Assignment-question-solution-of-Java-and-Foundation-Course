// Que 09 : Reverse the digit of a number .
import java.util.Scanner;

public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num = sc.nextInt();
        int temp = num;
        int Reverse = 0;
        while (num > 0) {
            int rem = num % 10;
            Reverse = (Reverse * 10) + rem;
            num /= 10;
        }
        System.out.println("Reverse of " + temp + " is :" + Reverse);
        sc.close();
    }
}
