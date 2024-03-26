// Que 06 - Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter.
import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        int len = sc.nextInt();
        System.out.println("Enter the Breadth of the rectangle:");
        int brd = sc.nextInt();
        int AOR=len*brd; //Area Of Rectangle
        double POR=2*(len+brd);//Perimeter Of Rectangle
        if(AOR>POR){
            System.out.println("Area Of Rectangle is Greater");
        }
        else{
            System.out.println("Perimeter Of Rectangle is Greater");
        }
        sc.close();
    }
}
