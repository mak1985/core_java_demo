package session09;

public class Student2 {

    // instance variables
    String name; //declaration
    int roll_no;//declaration

    //method to insert record
    void insertRecord(String student_name, int student_rollno) // peremeterized method
    {
        name = student_name;
        roll_no = student_rollno;
    }
    //method to display information
    void displayInformation()
    {
        System.out.println(name + " "+roll_no);
        //System.out.println(roll_no);
    }

}
