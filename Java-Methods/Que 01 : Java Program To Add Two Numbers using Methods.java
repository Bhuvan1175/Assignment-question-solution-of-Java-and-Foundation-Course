// Que 01 : Java Program To Add Two Numbers using Methods
import java.util.Scanner;
class Add{
   int Sum(int a, int b){
        return a+b;
    }
}
public class AdditionMethod {
    public static void main(String[] args) {
        Add sum=new Add();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int x=sc.nextInt();
        System.out.print("Enter Second Number:");
        int y=sc.nextInt();
        System.out.println("Sum of "+x+ " and "+y+" is : "+sum.Sum(x,y));
        sc.close();

    }
}
