package session11;

class Student {

    //class variables
    int roll; //non-static var
    String studentName;
    static String collegeName = "Jai Hind College";

    Student(int rollNo, String name)
    {
        roll = rollNo;
        studentName = name;
    }

    protected void display()
    {
        System.out.println(studentName+roll+collegeName);
    }

    //static method to change the value of collegeName.
    static void changeValue()
    {
        collegeName = "Holly Cross College";
    }

    public static void main(String[] args)
    {

        Student obj = new Student(10, "Tom");
        Student obj1 = new Student(11, "Harry");

        obj.display();
        obj1.display();

        changeValue();
        System.out.println("After college name changed");

        obj.display();
        obj1.display();
    }
}
