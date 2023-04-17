package session11;

import java.util.Scanner;

public class UserInputForm {
    public static void main(String[] args) {
        System.out.println("Enter user name, age, salary");

        Scanner myObj = new Scanner(System.in);

        //String input for name
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        double salary = myObj.nextDouble();


        System.out.println("Name is :" + name);
        System.out.println("Age is :" + age);
        System.out.println("Salary is :" + salary);

    }
}
