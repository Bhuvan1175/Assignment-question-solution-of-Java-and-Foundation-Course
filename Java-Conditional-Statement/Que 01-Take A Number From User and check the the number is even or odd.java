// Que 01-Take A Number From User and check the the number is even or odd.
import java.util.Scanner;
public class evenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a number: ");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("Given Number Is Even ");
        }
        else{
            System.out.println("Given Number Is Odd");
        }
        sc.close();
    }
}
