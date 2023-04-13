package session09;

public class StudentMain {
    public static void main(String[] args) {

        //Create an object of Student2 class
        Student2 studentObj1 = new Student2();
        Student2 studentObj2 = new Student2();

        //initialize an object
        studentObj1.insertRecord("John", 10);
        studentObj2.insertRecord("Paul", 9);

        //print student information
        studentObj1.displayInformation();
        studentObj2.displayInformation();

    }
}
