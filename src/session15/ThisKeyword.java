package session15;

public class ThisKeyword {

    int age;

    ThisKeyword(int age)
    {
        this.age = age;
    }


    void m1(int age)
    {

        this.age = age;
    }
    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(40);
        System.out.println("obj age" + obj.age);
    }





}
