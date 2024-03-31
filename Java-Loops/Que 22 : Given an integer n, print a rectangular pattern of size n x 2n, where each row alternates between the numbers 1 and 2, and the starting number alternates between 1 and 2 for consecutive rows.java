// Que 22 : Given an integer n, print a rectangular pattern of size n x 2n, where each row alternates between the numbers 1 and 2, and the starting number alternates between 1 and 2 for consecutive rows
//                      1 2 1 2 1 2
//                      2 1 2 1 2 1
//                      1 2 1 2 1 2
//                      2 1 2 1 2 1
import java.util.Scanner;

public class oneTwoPatternSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int row = sc.nextInt();
        System.out.print("Enter the number of Column:");
        int column = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
