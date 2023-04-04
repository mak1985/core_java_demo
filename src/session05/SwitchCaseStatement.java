package session05;

public class SwitchCaseStatement {

    public static void main(String[] args) {

        int age = 8;

        String countryName = "USA";

        switch (countryName)
        {
            case "India": System.out.println("Print India");break;

            case "USA": System.out.println("Print USA");
            break;

            case "UK": System.out.println("Print UK");
            break;

            default: System.out.println("Country not found");
        }

        switch (age)
        {
            case 5: System.out.println("Print India");break;

            case 10: System.out.println("Print USA");
                break;

            case 15: System.out.println("Print UK");
                break;

            default: System.out.println("Country not found");
        }
    }
}
