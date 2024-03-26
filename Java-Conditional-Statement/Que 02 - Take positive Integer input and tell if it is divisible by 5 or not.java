
// Que 02 - Take positive Integer input and tell if it isdivisible by 5 or not.
import java.util.Scanner;

public class divisibleQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Positive integer: ");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Number Is Divisible By 5");
        } else {
            System.out.println("Number Is Not Divisible by 5");
        }
        sc.close();
    }
}
