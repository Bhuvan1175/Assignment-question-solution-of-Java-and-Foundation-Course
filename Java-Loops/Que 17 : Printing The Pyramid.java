// Que 17 : Printing The Pyramid.
//            * 
//          * * * 
//        * * * * * 
//      * * * * * * * 
//    * * * * * * * * * 
import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows : ");
        int row=sc.nextInt();
        // Transerversing only Number of Rows.
        for(int i=1;i<=row;i++){
            // row-i for Printing Space
            for(int j=1;j<=row-i;j++){
                System.out.print("  ");
            }
            // 2*row-1 for printing  Stars in each Row.
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
