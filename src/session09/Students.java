package session09;

public class Students {
    // instance variables
    String name; //declaration
    int roll_no;//declaration

    //method to display information
    void displayInformation()
    {
        System.out.println(name + " "+ roll_no); //instance variable
        //System.out.println(roll_no);//instance variable
    }

    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();

        //initialize object/store data to the object student1
        student1.name = "John";
        student1.roll_no = 10;

        student2.name = "Paul";
        student2.roll_no = 9;

        //print information of student1 & student2
        student1.displayInformation();
        student2.displayInformation();
    }

}
