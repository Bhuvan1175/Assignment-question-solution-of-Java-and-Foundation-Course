
// Que 17 - Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.
import java.util.Scanner;

public class divisibleThirdQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        if ((num % 5 == 0 || num % 3 == 0) && (num % 15 != 0)) {
            System.out.println(num + " is divisible by either 5 Or 3 and Not Divisible by 15  ");
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
