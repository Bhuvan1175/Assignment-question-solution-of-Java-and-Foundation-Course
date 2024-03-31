// Que 13 : Given two number a,b.find a raise to power b.
import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value for A :");
        int a = sc.nextInt();
        System.out.print("Enter The value for B :");
        int b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println("Power of " + a + " raise to power " + b + " is : " + ans);
        sc.close();
    }
}
