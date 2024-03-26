// Que 18 - Given three points (x1, y1), (x2, y2) and (x3, y3), write a program to check if all the three points fall on one straight line.
import java.util.Scanner;

public class straightLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Point X1 : ");
        int x1 = sc.nextInt();
        System.out.print("Point Y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Point X2 : ");
        int x2 = sc.nextInt();
        System.out.print("Point Y2 : ");
        int y2 = sc.nextInt();
        System.out.print("Point X3 : ");
        int x3 = sc.nextInt();
        System.out.print("Point Y3 : ");
        int y3 = sc.nextInt();
        double M1 = (double) (y2 - y1) / (x2 - x1);
        double M2 = (double) (y3 - y2) / (x3 - x2);
        if (M1 == M2) {
            System.out.println("The three points are on the same line");
        } else {
            System.out.println("The three points are not on the same line");
        }
        sc.close();
    }
}
