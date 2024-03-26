// Q3 - Write a program to calculate the sum of the digits of a 3-digit number.
import java.util.Scanner;
public class digitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Three Digit Number : ");
        int num =sc.nextInt();
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.println("Sum of Digits is : "+sum);
        sc.close();
    }
}
