// Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.
import java.util.Scanner;
public class operationQue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int x =sc.nextInt();
        System.out.println((((8+x)/3)%5)*5 +" is the Final Result.");
        sc.close();
    }
}
