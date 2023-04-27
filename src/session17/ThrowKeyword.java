package session17;

public class ThrowKeyword {
    static void checkAge(int age)
    {

        if(age < 18)
        {
            //Syntax:  throw new exception_class("error message")
            throw new ArithmeticException("Access Denied");
        }
        else
        {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        checkAge(17);
        System.out.println("Rest of the code");
    }
}
