//Q2 - Input two different string and print them in same line.java
import java.util.Scanner;
public class twoStringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First String :");
        String first=sc.nextLine();
        System.out.println("Enter Second String :");
        String second=sc.nextLine();
        System.out.print(first);
        System.out.print(second);
        sc.close();

    }
}
