package session13;


class Parent
{
    int a;
    void display()
    {
        System.out.println("Class Parent:"+a);
    }
}
class Child1 extends Parent
{
    int b;
    void displayChild1()
    {
        System.out.println("Class Child1 :" +b);
    }
}
class Child2 extends Parent
{
    int c;
    void displayChild2()
    {
        System.out.println("Class Child2:"+c);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Child1 son1 = new Child1();
        son1.a = 100; //Class Parent
        son1.b = 200; //Class Child1
        son1.display(); //Class Parent
        son1.displayChild1();//Class Child1

        Child2 son2 = new Child2();
        son2.a = 300; //Class Parent
        son2.c = 400; //Class Child2
        son2.display(); //Class Parent
        son2.displayChild2(); //Class Child2
    }
}
