// Que 03 : You are required to develop a simple digital calculator program in Java using object-oriented programming concepts. The calculator should be able to perform basic arithmetic operations such as addition, subtraction, multiplication, division, and modulus operation.
import java.util.Scanner;
class Algebra{
    int a;
    int b;
    Algebra(int x,int y){
        System.out.println("Algebra class constructor called ");
        a=x;
        b=y;

    }
    int add(){
        return a+b;
    }
    int sub(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
    int mod(){
        return a%b;
    }
    int div(){
        if(b!=0){
            return a/b;
        }
        else{
            System.out.println("cannot divide by 0");
            return -1;
        }
    }
}
public class parameterizedConstructor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Value of x :");
        int x=sc.nextInt();
        System.out.print("Enter Value of y :");
        int y=sc.nextInt();
        Algebra obj=new Algebra(x,y);
        System.out.println("---------------------Digital Calulator--------------------");
        System.out.println("Addition        : "+obj.add());
        System.out.println("Subtraction     : "+obj.sub());
        System.out.println("Multiplication  : "+obj.mul());
        System.out.println("Modulus         : "+obj.mod());
        int divisionResult= obj.mod();
        if(divisionResult!=-1){
            System.out.println("Division      \t: "+divisionResult);
        }
        System.out.println("----------------------------------------------------------");
        sc.close();
    }
}

