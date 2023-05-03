package session21;

import java.util.HashSet;

public class HashSetCode {
    public static void main(String[] args) {
        //Declare HashSet
        HashSet <String>  hs = new HashSet<>(); // Homo
        //Insert elements
        hs.add("Honda");
        hs.add("BMW");
        hs.add("Maruti");
        hs.add("Apple");
        hs.add("Apple");
        hs.add(null);
        System.out.println("Elements" + hs);


    }
}
