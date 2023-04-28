package session18;

class A extends Thread {
    public void run() //pre-defined method/function in Thread class
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Class A" +i);
        }
    }
}

class B extends Thread {
    public void run() //pre-defined method/function in Thread class
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Class B" +i);
        }
    }
}
public class MultiThreadingExample{
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.start();
        b1.start();
    }
}
