package session22;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        //HashMap m  = new HashMap();
        HashMap <Integer, String> hm = new HashMap<>();
        hm.put(101, "Tim");
        hm.put(102, "Sam");
        hm.put(104, "Tim");
        hm.put(103, "Lion");
        hm.put(null, null);

        System.out.println(hm); //{101=Tim, 102=Sam, 103=Lion, 104=Tim}

        //Fetch element
        System.out.println(hm.get(101));

        //remove
        hm.remove(104);
        System.out.println(hm);

        //containsKey()
        System.out.println(hm.containsKey(104));//false

        //containsValue()
        System.out.println(hm.containsValue("Tiger"));

        //isEmpty()
        System.out.println(hm.isEmpty());//No - false

        //keySet()
        System.out.println(hm.keySet()); //Returns all the keys present in the HashMap [101, 102, 103]

        //values()
        System.out.println(hm.values()); //[Tim, Sam, Lion]

        //entrySet()
        System.out.println(hm.entrySet()); // Return all the entries as Set - [101=Tim, 102=Sam, 103=Lion]

        for(Object o : hm.keySet()) {
            System.out.println(o);
        }
        for(Object o : hm.values()) {
            System.out.println(o);
        }
        for(Object o : hm.keySet()) {
            System.out.println(o + " "+ hm.get(o)); //key & value pairs
        }
    }
}
