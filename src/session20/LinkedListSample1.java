package session20;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSample1 {
    public static void main(String[] args) {
        //Create linkedlist for string
        LinkedList <String> cars = new LinkedList<String>();
        //Add elements to linkedlist
        cars.add("Maruti");
        cars.add("Honda");
        cars.add("Hyundai");
        System.out.println("Before addFirst method" + cars);
        //addfirst()
        cars.addFirst("Jeep");
        System.out.println("After addFirst method"+ cars);
        //addLast()
        cars.addLast("Jeep");
        System.out.println("After addLast method" + cars);
        //removeFirst()
        cars.removeFirst();
        System.out.println("After removeFirts method" + cars);
        //removeLast()
        cars.removeLast();
        System.out.println("After removeLast method" + cars);
        //getFirst()
        System.out.println("getFirst method: " + cars.getFirst());//Maruti
        //getLast()
        System.out.println("getLast method: " + cars.getLast());//Hyundai
        //push method - belongs to stack operation
        cars.add("Maruti");
        cars.add("Honda");
        cars.add("BMW");
        System.out.println("Before push method "+ cars);//[Maruti, Honda, Hyundai, Maruti, Honda, BMW]
        cars.push("Damage car");
        System.out.println("After push method "+ cars);
        //pop method---removes and return to first element
        System.out.println("pop method" + cars.pop());
        System.out.println("After pop method see the list of elements " + cars );
        //peek method - retrives the first element but not remove
        System.out.println("peek method " + cars.peek()); //Maruti
        System.out.println(cars); //[Maruti, Honda, Hyundai, Maruti, Honda, BMW]
        //peekFirst() -----
        System.out.println("peekFirst method "+ cars.peekFirst());

        //Reading elements from linkedList using for loop, for each loop & iterator method
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }

//        for (Object e: cars) {
//            System.out.println(e);
//        }

//        Iterator it = cars.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        //Methods we can use from Collections class
        //sort linkedlink
        Collections.sort(cars);
        System.out.println(cars);
    }
}
