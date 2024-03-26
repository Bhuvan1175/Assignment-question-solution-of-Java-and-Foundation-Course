// Que 11 - Take positive integer input and tell if it is divisible by 5 and 3.
import java.util.Scanner;
public class divisibleFiveandThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int  num = sc.nextInt();
        if(num%5==0&&num%3==0){
            System.out.println(num+" is Divisible by  both 5 & 3");
        }
        else{
            System.out.println(num+" is not Divisible by  both 5 & 3");
        }
        sc.close();
    }
}
