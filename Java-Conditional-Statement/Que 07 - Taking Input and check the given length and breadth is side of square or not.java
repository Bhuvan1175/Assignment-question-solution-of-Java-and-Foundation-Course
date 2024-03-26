// Que 07 - Taking Input and check the given length and breadth is side of square or not.
import java.util.Scanner;
public class checkSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Length : ");
        double length = sc.nextDouble();
        System.out.println("Enter The Breadth : ");
        double Breadth = sc.nextDouble();
        if(length==Breadth){
            System.out.println("Its Side of Square");
        }
        else{
            System.out.println("Its not a Square");
        }
        sc.close();
    }
}
