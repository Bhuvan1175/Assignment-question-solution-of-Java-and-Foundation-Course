// Que 15 - If the ages of Ram, Shyam and Ajay are input through the keyboard, write a program to determine the youngest of the three.
import java.util.Scanner;
public class youngest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Age of Ram :");
        int Ram=sc.nextInt();
        System.out.print("Enter Age of Shyam :");
        int Shyam=sc.nextInt();
        System.out.print("Enter Age of Ajay :");
        int Ajay=sc.nextInt();
        if(Ram<Shyam){
            if(Ram<Ajay){
                System.out.println("Ram  is the Youngest with age "+Ram);
            }else{
                System.out.println("Ajay is younger than Ram and Shyam with age " + Ajay);
            }
        }else {
            if(Shyam<Ajay){
                System.out.println("Shyam is Youngest with age "+Shyam);
            }
            else{
                System.out.println("Ajay is younger than Ram and Shyam with age " + Ajay);
            }
        }
        sc.close();
    }
}
