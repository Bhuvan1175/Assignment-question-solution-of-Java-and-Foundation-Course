
// Que 02 : Write a Java program that takes input for two students' details including roll number and name, and then displays their information. Ensure that the program correctly handles input using a Scanner object.
import java.util.Scanner;

class student {
    int rollNo;
    String studentName;
}

public class studentMainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // First Student Detail
        student s1 = new student();
        student s2 = new student();
        System.out.print("Enter Student Roll Number : ");
        s1.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name : ");
        s1.studentName = sc.nextLine();
        // Second Student Detail
        System.out.print("Enter Student Roll Number : ");
        s2.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Student Name : ");
        s2.studentName = sc.nextLine();

        // Displaying
        System.out.println("Hi " + s1.studentName + " Your Roll Num is : " + s1.rollNo);
        System.out.println("Hi " + s2.studentName + " Your Roll Num is : " + s2.rollNo);
        sc.close();
    }
}
