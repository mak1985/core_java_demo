package session06;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        // declare and initialization/instantiation of array
        int [][] salary = new int[2][1];

        // insert value in an array 2D
        //salary[row][col]
//        salary[0][0] = 10000;   //row =0; col = 0;
//        salary[0][1] = 20000;   //row=0, col = 1;
//
//        salary[1][0] = 30000;   //row =1; col = 0;
//        salary[1][1] = 40000;   //row=1, col = 1;
//
//        salary[2][0] = 50000;   //row =0; col = 0;
//        salary[2][1] = 60000;   //row=0, col = 1;

        int [] [] salary1 = { {10000, 20000}, {30000,40000}, {50000, 60000} }; // 2nd way

        //print size of row and column
//        System.out.println("No. of rows : " + salary1.length); //No. of rows : 3
//        System.out.println("No. of cols : " + salary1[0].length); //No. of cols : 2

        //  read all the records of an array
//        for (int i = 0; i<salary.length; i++ ) // i=0; i=1; i=2
//        {
//            for (int j = 0; j<salary.length; j++ ) //j=0
//            {
//                System.out.println(salary[i][j]);
//            }
//
//        }

        for (int [] rowValueRead : salary1) { //{10000,20000}
            for (int columnValueRead : rowValueRead)
            {
                System.out.println(columnValueRead);
            }
        }
    }
}
