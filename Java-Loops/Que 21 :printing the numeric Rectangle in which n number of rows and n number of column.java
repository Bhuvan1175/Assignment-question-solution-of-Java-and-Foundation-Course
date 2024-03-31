// Que 21 :printing the numeric Rectangle in which n number of rows and n number of column.
//                                     1 2 3 4 5 6 
//                                     1 2 3 4 5 6 
//                                     1 2 3 4 5 6 
//                                     1 2 3 4 5 6 
import java.util.Scanner;

public class sameNumericTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Rows : ");
        int row = sc.nextInt();
        System.out.print("Enter number of Column : ");
        int column = sc.nextInt();
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
