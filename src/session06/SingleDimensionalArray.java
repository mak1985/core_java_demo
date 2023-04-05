package session06;

public class SingleDimensionalArray {

    public static void main(String[] args) {

        //Declare and initialization/instantiation - approach 1
        int [] emp_salary = new int[5];
        //String [] company = new String[5];

        //insert value in an array
        emp_salary[0] = 50000;
        emp_salary[1] = 60000;
        emp_salary[2] = 70000;
        emp_salary[3] = 80000;
        emp_salary[4] = 90000;
        //        emp_salary[5] = 90000;

        //Declare and initialization/instantiation - approach 2
        int [] emp_sal = {50000,60000, 70000,80000,80000,100, 25555, 122222};


        //print size of an array
        System.out.println("Size of an array: " + emp_salary.length);//5

        System.out.println("Size of an array for emp_sal: " + emp_sal.length);

        //Read values from an array
        System.out.println("Value of 4th element: " + emp_salary[3]);//80000

        System.out.println("Value of 4th element for emp_sal: " + emp_sal[3]);

    }
}
