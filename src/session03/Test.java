package session03;

public class Test {

    public static void main(String[] args) {

        // && AND
        System.out.println((5 > 3) && (10 > 5)); //true
        System.out.println((5 > 3) && (10 < 5)); //false


        System.out.println((5 < 3) || (10 > 5));//true
        System.out.println((5 > 3) || (10 < 5));//true

        System.out.println(!(5 == 3));//true
        System.out.println(!(5 > 3));//false

    }
}
