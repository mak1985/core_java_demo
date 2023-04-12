package session08;

public class Student {

    int id; // Non-static -------Data members(also instance variable)
    String name;//Non-static -------Data members(also instance variable)

    public static void main(String[] args) {
        //Create an object to call non-static methods

        //Syntax: ClassName objName = new ClassName();
        Student obj1 = new Student();

        System.out.println(obj1.id);
        System.out.println(obj1.name);
    }

}
