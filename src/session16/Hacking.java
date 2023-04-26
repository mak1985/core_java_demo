package session16;

public class Hacking {
    public static void main(String[] args) {

        EmployeeData obj = new EmployeeData();
        System.out.println(obj.getEmpAge()); //Fetch the record
        System.out.println(obj.getSsn());
        obj.setSsn(123445566);
        System.out.println(obj.getSsn());
        System.out.println(obj.getEmpName());

    }
}
