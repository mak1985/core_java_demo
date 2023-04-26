package session16;

public class EmployeeData {

    // how to implement encapsulation(data hiding)
    //1 . private data variables : So that these variables cannot accessed directly from outside the class

    private int ssn;
    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    private String empName;
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    private int empAge;

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }





}
