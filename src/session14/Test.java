package session14;

abstract class BikeClass
{
    //constructor
    BikeClass()
    {
        System.out.println("Bike class created");
    }
    //create abstract method
     abstract void run(); //abstract method does not have bofy

    //create non-abstract method
    void start()
    {
        System.out.println("Bike started");
    }
    //create static method
    static void stop()
    {
        System.out.println("Bike stopped");
    }

}

class Tvs extends BikeClass
{
    void run()
    {
        System.out.println("TVS child class run implemented");
    }
}
class Honda extends BikeClass
{
    void run()
    {
        System.out.println("Honda child class run implemented");
    }
}
class Yamaha extends BikeClass
{
    void run()
    {
        System.out.println("Yamaha child class run implemented");
    }
}
public class Test {

}
