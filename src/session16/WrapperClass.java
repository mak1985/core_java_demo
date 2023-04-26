package session16;

public class WrapperClass {
    public static void main(String[] args) {
        int y = 10;
        String str = "20000000000";

        y = Integer.parseInt(str); //Object to primitive
        System.out.println(y); //2000

        double d;
        String str1 = "3.14";
        d = Double.parseDouble(str1); //Object to primitive
        System.out.println(d); //3.14

//        Integer a = new Integer(5);
//        System.out.println(a); //5

        int i = 10;
        Integer b = Integer.valueOf(i); // Primitive to Object conversion
        System.out.println(b);

    }
}
