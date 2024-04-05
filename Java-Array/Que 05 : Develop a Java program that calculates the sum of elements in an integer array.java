// Que 05 : Develop a Java program that calculates the sum of elements in an integer array.
public class sumFinding {
    public static void main(String[] args) {
        int A[]={1,2,3};
        int sum=0;
        for(int i=0;i<A.length-1;i++){
            sum=sum+A[i];    
        }
        System.out.println("The sum of the array is "+sum);
    }
}
