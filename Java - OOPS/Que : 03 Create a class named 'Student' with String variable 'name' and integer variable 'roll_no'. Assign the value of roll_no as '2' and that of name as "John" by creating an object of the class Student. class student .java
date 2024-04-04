// Que : 03 Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
class student {
    int rollNo;
    String name;
}

public class studentDetail {
    public static void main(String[] args) {
        student s = new student();
        s.rollNo = 2;
        s.name = "John Doe";
        System.out.println("Your Roll No is :  " + s.rollNo);
        System.out.println("Your Name  is :     " + s.name);
    }
}
