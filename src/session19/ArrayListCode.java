package session19;

import java.util.ArrayList;

public class ArrayListCode {
    public static void main(String[] args) {

        //Declare arraylist - approach 1
        ArrayList obj = new ArrayList(); //Hetrogenous data (All kind of data types)

        //Declare arraylist - approach 2
        //ArrayList <String> obj = new ArrayList <> (); //Homogenious data

        //Adding data to ArrayList
        obj.add("Java");
        obj.add(100);
        obj.add('M');
        obj.add(true);
        obj.add(12.4);

        //print arraylist
        System.out.println(obj);

        //size method
        System.out.println(obj.size()); //5

        //remove element
        obj.remove(1);

        //print arraylist after removing
        System.out.println(obj);

        //get method - to fetch any specific value
        System.out.println(obj.get(3));

        //set method - To replace/change the lelement
        obj.set(0, "JavaScript");
        System.out.println(obj);

        //insert element to arraylist
        obj.add(0, "Python");
        System.out.println(obj);

        //contains() - To search element in arraylist
        System.out.println(obj.contains("Python")); //true

        //clear() - remove all the elements from the collection
        obj.clear();
        System.out.println(obj);

        //isEmpty() -true or false
        System.out.println(obj.isEmpty()); //No- false

    }
}
