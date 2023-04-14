package session10;



public class Counter {

    static void m1()
    {
        System.out.println("Test");
    }
//    int count = 0; //non-static variable.

    static int count = 0;

    Counter()
    {
        count++; //incre by 1
        System.out.println(count);
    }

    public static void main(String[] args) {
//        Counter obj = new Counter();
//        System.out.println(obj.count);
        System.out.println(Counter.count);
        m1();

    }
}
