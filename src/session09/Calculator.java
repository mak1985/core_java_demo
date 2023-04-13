package session09;

public class Calculator {
    /**
     * 1. Syntax of method:
     * modifier_name    return_type nameOfMethod(Parameter)
     */
    //create static method
    static void printMessage() //no return type and no parameters
    {
        System.out.println("Welcome to coding world");
    }

    //Non-static method
    void printMessage1()
    {
        System.out.println("Welcome to coding world again");
    }

    //method to sum two numbers
    static void sum(int a, int b) //static, return nothing as it's void as returntype, parameterized
    {
        System.out.println("Sum of a & b :" + (a+b));
    }

    //return type method ---will return something, also have to use return keyword
    static int sum1(int a, int b) //parameterized
    {
        return (a+b);
    }

    static int minimum(int a, int b)
    {
        if(a < b) // If a is smaller than b
            return a;
        else
            return b; // If b is smaller than a
    }

    public static void main(String[] args) {

        //Calling static method without creating an object
        printMessage();
        Calculator calc = new Calculator();
        calc.printMessage1(); //Created an object to call non-static method
        sum(10, 20); // 10 & 20 arguments passed to sum method

        int result = sum1(2,5);
        System.out.println("Sum1 of a & b is: "+ result);
        System.out.println(minimum(4, 8)); // Calling from main class
    }
}
