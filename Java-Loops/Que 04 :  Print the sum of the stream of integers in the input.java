// Que 04 :  Print the sum of the stream of integers in the input.
import java.util.Scanner;
public class StreamSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){
            sum+=num;
            num=sc.nextInt();
        }
        System.out.println("Sum is :"+sum);
        sc.close();
    }
}
