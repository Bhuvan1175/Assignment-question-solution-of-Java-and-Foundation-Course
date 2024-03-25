//Q1 - Input name, roll number and field of interest from user and print in the format below :Name: xyz, Roll number: xyz, Field of interest: xyz.
import java.util.Scanner;
public class inputStudentDetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String name = sc.nextLine();
        System.out.println("Enter Your Roll Number : ");
        String rollNumber = sc.nextLine();
        System.out.println("Enter Your Interest :");
        String interest = sc.nextLine();
        System.out.println("Name :"+name);
        System.out.println("Roll Number : "+rollNumber);
        System.out.println("Interest : "+interest);
        sc.close();
    }
}
