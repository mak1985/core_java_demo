package session02;

public class PrimitiveDataTypes {
    public static void main(String[] args) {

        //1) Primitive data types  - single line comment

        // Integer (byte - (1 byte), short(2bytes), int(4 bytes and long(8 bytes)

        byte roll_no = 100;
        short admission_year = 2023;
        int registration_number = 1234567890;
        long certificate_number = 2023030100;

        //decimal/float type - float(4 bytes) and double(8 bytes)
        float percentage = 90.3f;
        double pass_percentage = 39.0;

        //logical (true/false)  - (boolean 1 byte)
        boolean IsActive = true;

        //textual(type/signle character - char (2 bytes)

        char gender = 'M';

        System.out.println(roll_no);
        System.out.println(admission_year);
        System.out.println(registration_number);
        System.out.println(certificate_number);
        System.out.println(percentage);
        System.out.println(pass_percentage);
        System.out.println(IsActive);
        System.out.println(gender);


    }
}
