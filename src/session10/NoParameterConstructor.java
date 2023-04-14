package session10;

public class NoParameterConstructor {

    int x; // attribute of class

    NoParameterConstructor()
    {
        // initialize object
        x = 10; //initialize value to the attribute
    }

    public static void main(String[] args) {
        NoParameterConstructor obj = new NoParameterConstructor();
        System.out.println(obj.x); //print value of x as 10
    }

}
