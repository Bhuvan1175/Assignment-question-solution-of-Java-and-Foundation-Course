// Que 12 :Print first n number of factorial.
import java.util.Scanner;
public class nNumberFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        while (i <= num) {
            fact = fact * i;
            System.out.println("Factorial of " + i + " is : " + fact);
            i++;
        }
        sc.close();
    }
}
