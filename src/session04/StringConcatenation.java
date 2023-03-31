package session04;

public class StringConcatenation {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Java";
        String str3 = "Hey";

        String s1 = 50+10+"Value"+20+30;
        System.out.println(s1);

        String s = "MS" + " Dhoni";


        String a1 = "Antara ";
        String a2 = "Dhar";
        String a3 = a1.concat(a2);
        System.out.println(a3);
        System.out.println(s);
        System.out.println(str1+ "          " +str2 + " " +str3); //HelloJava


        StringBuilder b1 = new StringBuilder("1223");
        StringBuilder b2 = new StringBuilder("1223");
        StringBuilder b3 = b1.append(b2);
        System.out.println(b3.toString());
    }
}
