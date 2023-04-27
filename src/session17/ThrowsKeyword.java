package session17;

import java.io.IOException;

public class ThrowsKeyword {

    static void checkAge(int age) throws ArithmeticException, IndexOutOfBoundsException, IOException, NumberFormatException, NullPointerException {

        if (age < 18) {
            //Syntax:  throw new exception_class("error message")
            throw new ArithmeticException("Access Denied");
        } else {
            System.out.println("Access Granted");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(17);
        }
        catch (Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
