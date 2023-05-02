package session19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        //Declare array list -----collection 1
        ArrayList <String> obj = new ArrayList<>();
        obj.add("S");
        obj.add("A");
        obj.add("M");
        System.out.println(obj); // S A M

        //addAll() - To add collection to different collection ----------collection 2
        ArrayList <String> obj2 = new ArrayList<>();
        obj2.addAll(obj);
        System.out.println("After adding: " + obj2);

        //removeAll() - remove collection elements
//        obj2.removeAll(obj);
//        System.out.println("After Removing: "+ obj2);

        //How to use loop through elements of array list
        /**
         * 1. for loop
         * 2. for each or enhanched for loop
         * 3. iterator
         */

//        for (int i=0; i<obj.size(); i++) {
//            System.out.println(obj.get(i));
//        }

//        for (String i : obj) {
//            System.out.println(i);
//        }
//
//        Iterator it = obj.iterator();
//            while (it.hasNext()) {
//                System.out.println(it.next());
//            }

        //How to sort arraylist collections class
        System.out.println("Before sorting" + obj);
        Collections.sort(obj);
        System.out.println("After sorting" + obj);

        //sorting arraylist in reverse order
        Collections.sort(obj, Collections.reverseOrder());
        System.out.println("After reverse order sorting " + obj);

        //shuffle arraylist
        Collections.shuffle(obj);
        System.out.println("After shuffling :" + obj);

        //How to create arraylist from array
        //Create string array
        String cars[] = {"Honda", "BMW", "Fort"};

        ArrayList obj3 = new ArrayList(Arrays.asList(cars));
        System.out.println(obj3); //Honda, BMW, Fort

    }
}
