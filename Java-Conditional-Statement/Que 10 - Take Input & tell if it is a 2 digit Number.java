// Que 10 - Take Input & tell if it is a 2 digit Number.
import java.util.Scanner;
public class twoDigitCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number :");
        int num =sc.nextInt();
        if(num>9 && num<100){
            System.out.println(num+" Is A Three Digit Number.");
        }
        else{
            System.out.println(num+" Is Not A Three Digit Number.");
        }
        sc.close();
    }
}
