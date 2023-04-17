package session11;

public class StaticBlock {

    static void m1()
    {
        System.out.println("This is my static method");
    }

    static  //static block
    {
        System.out.println("This is my static block");
    }

    StaticBlock()
    {
        System.out.println("This is constructor");
    }
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println("This is my main method");
        m1();


    }

}
