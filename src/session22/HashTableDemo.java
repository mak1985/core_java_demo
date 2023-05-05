package session22;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableDemo {
    public static void main(String[] args) {

        //Hashtable table = new Hashtable(); //Capacity is 11, load factor is 0.75

        Hashtable <Integer, String> table = new Hashtable<>();
        table.put(101, "Rama");
        table.put(102, "Raman");
        table.put(103, "Rocky");
//        table.put(null, "Null Value");
//        table.put(104, null);
        System.out.println(table);
        System.out.println(table.get(102));
        table.remove(102);
        System.out.println(table);

        //entry specific method
//            for (Map.Entry entry: table.entrySet()) {
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }

            //Iterator()
        Set s = table.entrySet();
        Iterator it = s.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            System.out.println("Coooooooooo: " +entry.getKey() + " "+entry.getValue());
        }


    }

}
