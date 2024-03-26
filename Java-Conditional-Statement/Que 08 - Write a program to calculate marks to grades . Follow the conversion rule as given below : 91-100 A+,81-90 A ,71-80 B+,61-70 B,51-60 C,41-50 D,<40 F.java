
// Que 08 - Write a program to calculate marks to grades . Follow the conversion rule as given below : 91-100 A+,81-90 A ,71-80 B+,61-70 B,51-60 C,41-50 D,<40 F.
import java.util.Scanner;

public class gradeCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Percentage of Yours In Examination (%): ");
        double percentage = sc.nextDouble();
        String Grade;
        if (percentage > 91 && percentage <= 100) {
            Grade = "A+";
        } else if (percentage > 81 && percentage <= 90) {
            Grade = "A";
        } else if (percentage > 71 && percentage <= 80) {
            Grade = "B+";
        } else if (percentage > 61 && percentage <= 70) {
            Grade = "B";
        } else if (percentage > 51 && percentage <= 60) {
            Grade = "C";
        } else if (percentage > 41 && percentage <= 50) {
            Grade = "D";
        } else {
            Grade = "F";
        }
        System.out.println("Your Grade is: " + Grade);
        sc.close();

    }
}
