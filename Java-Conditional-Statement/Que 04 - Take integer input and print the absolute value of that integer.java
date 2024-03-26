//Que 04 - Take integer input and print the absolute value of that integer.
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number :");
        int num = sc.nextInt();
        if(num<0){
            num=num*(-1);
        }
        System.out.println("Absolute Value Of The Given Number Is: "+num);
        sc.close();
    }
}
