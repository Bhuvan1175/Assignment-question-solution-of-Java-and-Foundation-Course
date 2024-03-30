// Que 02 :- Print the Sum of the first n natural number , when n is the input.
import java.util.Scanner;
public class naturalSum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Natural Number : ");
        int n=sc.nextInt();
        int num=1;
        while(num<=n){
            sum=sum+num;
            num++;
        }
        System.out.println("Sum of Natural Number is : "+sum);
        sc.close();
    }
}
