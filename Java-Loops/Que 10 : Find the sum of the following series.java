// Que 10 : Find the sum of the following series.
import java.util.Scanner;
public class seriesSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms:");
        int n = sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                ans-=i;
            }else{
                ans+=i;
            }
        }
        System.out.println("Series sum is :"+ans);
        sc.close();
    }
}
