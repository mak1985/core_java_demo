package session22;

import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetCode {
    public static void main(String[] args) {
        //create linkedhashset

        //LinkedHashSet <Integer> linkedHashSet = new LinkedHashSet<>();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add("ABC");
        linkedHashSet.add(null);
        linkedHashSet.add("ABC");
        System.out.println(linkedHashSet);

    }
}
