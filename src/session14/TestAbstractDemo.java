package session14;

public class TestAbstractDemo {
    public static void main(String[] args) {
        BikeClass obj = new Tvs();
        obj.start(); //non-abstarct method
        obj.run(); //abstract method
        BikeClass.stop(); //static method

        BikeClass obj1 = new Honda();
        obj1.start();
        obj1.run();
        BikeClass.stop();

        BikeClass obj2 = new Yamaha();
        obj2.start();
        obj2.run();
        BikeClass.stop();



    }
}
