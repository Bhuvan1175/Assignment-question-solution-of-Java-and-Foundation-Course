// Que 12 - WAP to input a number and tell if it is divisible by 5 but not divisible by 3.
import java.util.Scanner;
public class divisibleCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any Number :");
        int num =sc.nextInt();
        if(num%5==0&&num%3!=0){
            System.out.println(num+" is divisible by 5 and  not divisible by 3.");
        }
        sc.close();
    }
}
