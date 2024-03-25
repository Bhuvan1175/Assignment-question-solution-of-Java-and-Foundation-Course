//Q3 - If the marks of Robert in three subjects are entered through keyboard (each out of 100), write a program to calculate his total marks and percentage marks.
import java.util.Scanner;

public class marksStudentInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks of Subject-01 : ");
        int subject_1 = sc.nextInt();
        System.out.println("Enter the Marks of Subject-02 : ");
        int subject_2 = sc.nextInt();
        System.out.println("Enter the Marks of Subject-03 : ");
        int subject_3 = sc.nextInt();
        double totalMarks = 300;
        double obtainedMarks = subject_1 + subject_2 + subject_3;
        double percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Robert Got a " + percentage + " % in his examination.");
        sc.close();
    }
}
