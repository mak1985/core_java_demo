package session05;

public class DoWhileLoop {
    public static void main(String[] args) {

        //Print even number using do while loop 1 - 20

        int i = 2;

        do {
            System.out.println("Value of i: " + i);
            i = i+2;
        }
        while (i <=10);
        System.out.println("do while loop exits, value of i: " + i);
    }
}
