package session15;


class Animal
{
    String color = "White";

}
class Dog extends Animal
{
    String color = "Black";

    void printColor()
    {
        System.out.println(color); //print color of Dog Class value = Black
        System.out.println(super.color); // print color of Animal class = white
    }
}
public class TestSuperClass {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.printColor();
    }
}
