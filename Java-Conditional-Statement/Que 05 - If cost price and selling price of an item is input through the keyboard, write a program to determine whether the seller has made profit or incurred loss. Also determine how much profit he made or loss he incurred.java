// Que 05 - If cost price and selling price of an item is input through the keyboard, write a program to determine whether the seller has made profit or incurred loss. Also determine how much profit he made or loss he incurred.
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the item:");
        int costPrice=sc.nextInt();
        System.out.println("Enter the Selling price of the item:");
        int sellingPrice=sc.nextInt();
        if(sellingPrice>costPrice){
            System.out.println("You have made a Profit!");
            System.out.println("Your Profit is : "+ (sellingPrice-costPrice));
        }
        else if(sellingPrice<costPrice){
            System.out.println("You have made a Loss!");
            System.out.println("Your Loss is : "+ (costPrice-sellingPrice));
        }
        else{
            System.out.println("Mismatched");
        }
        sc.close();
    }
}
