// Que 16:Printing The right angle triangle.
//                  *
//                  * *
//                  * * *
//                  * * * *
import java.util.Scanner;
public class rightAngleTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of Row :");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }   
            System.out.println();
        }
        sc.close();
    }
}
