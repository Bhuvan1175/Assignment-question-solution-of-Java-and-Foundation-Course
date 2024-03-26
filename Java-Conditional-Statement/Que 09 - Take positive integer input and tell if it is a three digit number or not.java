// Que 09 - Take positive integer input and tell if it is a three digit number or not.
import java.util.Scanner;
public class threeDigitCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num =sc.nextInt();
        if(num>99 && num<1000){
            System.out.println(num+" Is A Three Digit Number.");
        }
        else{
            System.out.println(num+" Is Not A Three Digit Number.");
        }
        sc.close();
    }
}
