// Que 01 : Take a Array From User.
import java.util.Scanner;
public class userArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of an Array");
        int Size=sc.nextInt();
        int A[]=new int[Size];
        for(int i=0;i<Size;i++){
            System.out.println("Enter the Value for "+(i+1)+" Index Element");
            A[i]=sc.nextInt();
        }
        for(int i=0;i<Size;i++){
            System.out.print(A[i]+" ");
        }
        sc.close();
    }
}

