package session07;

public class StringOperationsMethods {
    public static void main(String[] args) {

        /**
         * 1. charAt()
         */
        String s = "HelloJavahelloCHelloTest";
        System.out.println(s.charAt(6));

//        char[] ch = {'h', 'e', 'l','l','o'} ;
//        String s1 = new String(ch);
//        System.out.println(ch);

        /**
         * 2. length()
         */
        System.out.println(s.length());//11

        /**
         * toLowerCase()
         */
        System.out.println(s.toLowerCase());//hello  java

        /**
         * toUpperCase()
         */
        System.out.println(s.toUpperCase());//HELLO JAVA

        /**
         * replace()
         */
        System.out.println(s.replace("Java", "JavaScript"));//WELLO JAVA

        /**
         * indexOf()
         */
        System.out.println(s.indexOf('h'));

        /*
        subString()
         */
        System.out.println(s.substring(5));//JavahelloCHelloTest
        System.out.println(s.substring(0, 20));

        /*
        isEmpty()
         */
        s = "I am a boy";
        System.out.println(s.isEmpty());

        /*
        contains()
         */
        System.out.println(s.contains("girl"));

        /*
        startWith()
         */
        String str = "Lets start";
        System.out.println(str.startsWith("Le"));

        /*
        endWith()
         */
        System.out.println(str.endsWith("tar"));

        /*
        equals()
         */
        String s1 =  "Welcome";
        String s2 = "welcome";
        System.out.println("Is s1 equals s2: " + s1.equals(s2));

        /*
        equalsIgnoreCase()
         */
        System.out.println(s1.equalsIgnoreCase(s2));

        /*
        concat()
         */
        s1 = "Yeshwantha";
        s2 = " Ramarao";
        System.out.println(s1.concat(s2));//Yeshwantha Ramarao
        System.out.println(s1.concat(" Ramarao"));//Yeshwantha Ramarao
        System.out.println(s1 + s2);//Yeshwantha Ramarao
    }
}
