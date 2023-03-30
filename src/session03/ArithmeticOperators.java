package session03;

public class ArithmeticOperators {
    public static void main(String[] args) {

        //1) Arithmetic operators - (  +; - ; *; /,   ++(incremental); --(decremental) )

        int a = 20;
        int b = 10;

//        System.out.println(a+b); //30
//        System.out.println(a-b); //10
//        System.out.println(a*b);//200
//        System.out.println(a/b);//2

        //pre & post-incremental
//        System.out.println(a); //20
//        System.out.println("Pre-increment :" + ++a);//1+ privious value 20 = 21
//        System.out.println(a);//21
//        System.out.println("Post-increment: " + a++); //21
//        System.out.println(a); //22

        //pre & post-decrement
        System.out.println(b); //10
        System.out.println("Pre-decrement :" + --b);//9
        System.out.println(b);//9
        System.out.println("Post-decrement :" + b--);
        System.out.println(b);//8
        System.out.println(b ---6);
    }
}
