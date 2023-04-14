package session10;

public class EmployeesData {

    //instance variables
    int emp_salary; //non-static method
    String emp_name; //non-static method
    static String emp_designation = "Test Lead"; //static method

    public static void main(String[] args) {
        EmployeesData emp1 = new EmployeesData();
        emp1.emp_salary = 100000;
        emp1.emp_name = "John";

        System.out.println(emp1.emp_name + " " +emp1.emp_salary + emp_designation);

        EmployeesData emp2 = new EmployeesData();
        emp2.emp_salary = 100000;
        emp2.emp_name = "John";

        System.out.println(emp2.emp_name + " " +emp2.emp_salary + emp_designation);
    }
}
