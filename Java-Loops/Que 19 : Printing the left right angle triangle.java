//Que 19 : Printing the left right angle triangle.
import java.util.Scanner;
public class leftSideRightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number of Row :");
        int row =sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i);j++){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
