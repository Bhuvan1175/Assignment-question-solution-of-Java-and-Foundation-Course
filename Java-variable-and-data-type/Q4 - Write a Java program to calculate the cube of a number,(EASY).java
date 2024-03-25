//Q4 - Write a Java program to calculate the cube of a number.(EASY)
import java.util.Scanner;
public class fourthCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int num =sc.nextInt();
        int c=num*num*num;
        System.out.println("The Cube Of "+num+" Is : "+c);
        sc.close();
    }
   
    
}
