package session15;

interface showName {
    void showName(String name); // methods are abstract by default and public
}

interface showAge extends showName
{
    void showAge(int age);

}
interface m1 {
    void showM1();
}
interface m2 {
    void showM2();
}
public class InterfaceDemo implements  showAge, m1, m2{

    @Override
    public void showName(String name) {
        System.out.println("Name is: "+ name);
    }

    @Override
    public void showAge(int age) {
        System.out.println("Age is : "+age);
    }

    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.showAge(40);
        obj.showName("Tom");
    }

    @Override
    public void showM1() {

    }

    @Override
    public void showM2() {

    }
}
