

abstract class AeroPlane1
{
   abstract public void takeOff();
    // {
    //     System.out.println("AeroPlane1 Take Off");     => ane koi child child class vaparta nathi badha modification kare che atala mate ane hatavi ne "abstract" lakhi devanu agad
    // }

   abstract public void fly();
    // {
    //     System.out.println("AeroPlane11 is flying");
    // }

    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
}

class CargoPlane extends AeroPlane1
{

        public void takeOff()
    {
        System.out.println("CargoPlane Take Off and take neel`s export products");
    }

    public void fly()
    {
        System.out.println("CargoPlane is flying at lover height");
    }

    public void alert()
    {
        System.out.println("Alert..");     // Specialised method
    }

}

class PassengerPlane extends AeroPlane1
{

    public void takeOff()
    {
        System.out.println("PassengerPlane Take Off and take neel`s family products");
    }

    public void fly()
    {
        System.out.println("PassengerPlane is flying at heast height");
    }


}


public class Abstraction {

    public static void main(String[] arg)
    {

        AeroPlane1 ref=new CargoPlane();
        ref.takeOff();
        ref.fly();
        ref.landing();
        // ref.alert();      // error because aya "ref" ma parent class no refrance che and "alert" a child class maj che only 
        ((CargoPlane) ref).alert(); // fix karyu apade error ne "down cast" thi

        AeroPlane1 ref1=new PassengerPlane();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();

        // AeroPlane1 ref2=new AeroPlane1();    => abstract class no object na bane because a adhuro class che

    }
    
}
