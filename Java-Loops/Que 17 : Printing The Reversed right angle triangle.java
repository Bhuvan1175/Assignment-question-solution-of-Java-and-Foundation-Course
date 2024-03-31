// Que 17 : Printing The Reversed right angle triangle.
//                  * * * *
//                  * * *
//                  * *
//                  * 
import java.util.Scanner;
public class reversedRightTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Row :");
        int row=sc.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }   
            System.out.println();
        }
        sc.close();
    }
}
