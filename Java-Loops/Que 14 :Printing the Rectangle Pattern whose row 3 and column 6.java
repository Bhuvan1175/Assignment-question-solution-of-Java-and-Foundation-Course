
// Que 14 :Printing the Rectangle Pattern whose row 3 and coloumn 6.
//                         * * * * * *
//                         * * * * * *
//                         * * * * * *
import java.util.Scanner;

public class rectnagle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many Rows : ");
        int row = sc.nextInt();
        System.out.print("How many Columns : ");
        int Columns = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= Columns; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
