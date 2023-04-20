package session13;

class X
{

    int a;
    void display()
    {
        System.out.println("Class X : "+ a);
    }
}
class Y extends X
{
    int b;
    void print()
    {
        System.out.println("Class Y: "+b);
    }
}
class Z extends Y
{
    int c;
    void show()
    {
        System.out.println("Class Z: "+ c);
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {

        Z objZ = new Z();
        objZ.a = 100; //Class X
        objZ.b = 200; //Class Y
        objZ.c = 300; //Class Z
        objZ.display(); //Class X
        objZ.print(); //Class Y
        objZ.show(); //Class Z

    }
}
