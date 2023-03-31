package session04;

public class ConditionalOperators {
    public static void main(String[] args) {

        int a = 50;
        int b = 100;

        //syntax: data_type variable_name = (condition) ? expression1: expression2
        int minimum = a < b ? a : b;
        System.out.println(minimum);

    }
}
