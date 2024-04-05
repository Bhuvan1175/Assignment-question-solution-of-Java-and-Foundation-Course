// Que 04 : Find Length of an Array .
import java.util.Scanner;
public class arrayLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array:");
        int Size=sc.nextInt();
        int A[]=new int[Size];
        for(int i=0;i<Size;i++){
            System.out.println("Enter the "+(i+1)+" Element of Array:");
            A[i]=sc.nextInt();
        }
        for(int X:A){
            System.out.print(X+" ");
        }
        System.out.println("\n Length of an Array is : "+A.length);
        sc.close();
    }
}
