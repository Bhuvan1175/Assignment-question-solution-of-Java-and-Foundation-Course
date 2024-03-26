
//Que 16 - Take 3 numbers input and tell if they can be the sides of a triangle.
import java.util.Scanner;

public class triangleSide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Side A :");
        int A = sc.nextInt();
        System.out.print("Enter First Side B :");
        int B = sc.nextInt();
        System.out.print("Enter First Side C :");
        int C = sc.nextInt();
        if (((A + B) > C) && ((B + C) > A) && ((C + A) > B)) {
            System.out.println(A + " , " + B + " , " + C + " Are the side of Triangle. ");
        }else{
            System.out.println(A + " , " + B + " , " + C + " Are not the side of Triangle. ");
        }
        sc.close();
    }
}
