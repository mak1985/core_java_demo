package session13;

class A { //Parent class
    int a;
    void display()
    {
        System.out.println("Class A: " + a);
    }
}

class B extends A{ //Class B is child of class A
    int b;
    void print()
    {
        System.out.println("Class B "+ b);
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        A objA = new A();
        objA.a = 10;
        objA.display();

        B objB = new B();
        objB.a = 45; //Class A
        objB.b = 50; //Class B

        objB.display();//Class A
        objB.print();//Class B
    }
}
