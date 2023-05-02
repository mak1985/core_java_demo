package session20;

import java.util.LinkedList;

public class LinkedListDSample {
    public static void main(String[] args) {
        //Declare LinkedList - Collection 1
        LinkedList <String> list = new LinkedList<>();
        list.add("John");
        list.add("Paul");
        list.add("Sam");
        System.out.println(list);
        list.add(1, "Rocky");

        //Declare LinkedList - Collection 2
        LinkedList <String> list2 = new LinkedList<>();
        list2.add("Tom");
        list2.add("Harry");
        list2.add("Peter");




        list.addAll(list2);
        System.out.println("After adding collection1 to collection 2" + list);

        //remove()
        list.remove("Peter");
        System.out.println("After removing Peter from collection "+list);

        //removeAll---------------remove the collection
        list.removeAll(list2);
        System.out.println(list);
    }
}
