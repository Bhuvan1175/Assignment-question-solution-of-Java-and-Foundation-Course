//Que 03 - Any year is input through the keyboard. Write a program to determine whether the year is a leap year or not. (Considering leap year occurs after every 4 years).
import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Year : ");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0)||year%400==0){
            System.out.println(year+" is a Leap Year");
        }
        else{
            System.out.println(year+" is not a Leap Year");
        }
        sc.close();
    }
}
