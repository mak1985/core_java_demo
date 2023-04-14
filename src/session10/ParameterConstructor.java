package session10;

public class ParameterConstructor {

    //Attributes
    String car;
    int year;
    int a;

    //Constructor with parameter
    protected ParameterConstructor(String carName, int yr)
    {
        //initilaize attributes
        car = carName;
        year = yr;
    }
    ParameterConstructor()
    {
        a = 20;
    }

    public static void main(String[] args) {
        ParameterConstructor obj = new ParameterConstructor("Honda City", 2008);

        //Create class object, this will create constructor of class
        System.out.println(obj.car + " "+obj.year);
        System.out.println(obj.a);
    }
}
