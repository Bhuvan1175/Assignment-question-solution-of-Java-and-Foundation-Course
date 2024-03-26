//Que 13 - Take positive integer input and tell if it is divisible by 5 or 3.
import java.util.Scanner;
public class orDivisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num =sc.nextInt();
        if(num%5==0||num%3==0){
            System.out.println(" Number is Divisible By Either 5 Or 3");
        }
        else{
            System.out.println(" Number is not Divisible By Either 5 Or 3");
        }
        sc.close();
    }
}
