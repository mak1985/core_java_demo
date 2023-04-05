package session06;

public class BreakStatement {
    public static void main(String[] args) {

//        for (int i = 1; i <= 10; i++)
//        {
//            if (i == 2)
//                break; // Exit from the loop
//            System.out.println(i); //1, 2, 3, 4
//        }

        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;

            if (i == 4)
            {
                break;
            }
        }
    }
}
