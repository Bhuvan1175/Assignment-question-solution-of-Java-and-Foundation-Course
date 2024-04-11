// Que 04 : Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor. 
class myTriangle {
    double side1;
    double side2;
    double side3;

    public myTriangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateAreaTriangle() {
        double semiperimeter = calculatePerimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
    }
}

public class triangle {
    public static void main(String[] args) {
        myTriangle MT = new myTriangle();
        double Perimeter = MT.calculatePerimeter();
        double AreaOfTriangle = MT.calculateAreaTriangle();
        System.out.println("Perimeter Of Triangle is : " + Perimeter);
        System.out.println("Area of  the Triangle is: " + AreaOfTriangle);
    }
}

