package session17;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
//1. ArithmeticException
//        try {
//            int result = 100/0;
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println(e.toString());
//        }


   //2. NullPointerException
//   try{
//       String s = null;
//       System.out.println(s.length());
//   }
//    catch (NullPointerException e)
//    {
//        System.out.println(e.toString());
//    }

    //3. NumberFormatException

//
//        try{
//            String s = '123';
//            int i = Integer.parseInt(s);
//            System.out.println(i);
//        }
//        catch (NumberFormatException e)
//        {
//            System.out.println("Catch block:"+ e.toString());
//        }
//        finally {
//            System.out.println("Finally Block");
//        }

        //4. ArrayIndexOutOfBoundsException

        try {
            int a[] = new int[5];
            a[6] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Catch block:" + e.toString());
        }

        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Test completed");
    }

}
