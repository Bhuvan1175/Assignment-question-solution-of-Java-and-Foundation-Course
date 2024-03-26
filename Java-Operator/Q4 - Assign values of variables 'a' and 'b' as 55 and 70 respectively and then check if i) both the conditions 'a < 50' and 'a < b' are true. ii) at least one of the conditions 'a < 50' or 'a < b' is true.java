// Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if i) both the conditions 'a < 50' and 'a < b' are true.
// ii) at least one of the conditions 'a < 50' or 'a < b' is true.
import java.util.Scanner;

public class relationalQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 55;
        int b = 70;
        System.out.println("Both the conditions 'a < 50' and 'a < b' are true.");
        System.out.println(a < 50 & a < b);
        System.out.println("At least one of the conditions 'a < 50' or 'a < b' is true.");
        System.out.println(a < 50 | a < b);
        sc.close();
    }
}
