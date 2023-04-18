package session12;

class RbiBank //parent class
{
  double getRoi()
    {
        return 5.1;
    }
}

class AxisBank extends RbiBank //child class
{
    double getRoi()
    {
        return 6.3;
    }
}

class Icici extends RbiBank //child class
{
    double getRoi()
    {
        return 7.8;
    }

}

class Hdfc extends RbiBank //child class
{
    double getRoi()
    {
        return 8.3;
    }

}

public class MethodOverridding {
    public static void main(String[] args) {
        AxisBank objAxis = new AxisBank();
        System.out.println("Axis Bank ROI " + objAxis.getRoi() +"%");

        Hdfc objHdfc = new Hdfc();
        System.out.println("Hdfc Bank ROI " +objHdfc.getRoi() +"%");

        Icici objIcici = new Icici();
        System.out.println("Icici Bank ROI " +objIcici.getRoi() +"%");
    }


}
