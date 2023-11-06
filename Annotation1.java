
//function interface
@FunctionalInterface
interface Demo
{
    void disp();
    // void disp2();

}


// this is parent class

@Deprecated
class Plane
{
    public void planeFlies()
    {
        System.out.println("Plane Flying"); 
    }

}

//this is child class
class CargoPlane extends Plane
{

    //overriden method from parent class
    @Override
    public void planeFlies()
    {
        System.out.println("Cargo Plane Flying");
    }

}




public class Annotation1 {
    
    public static void main(String[] arg)
    {

        //Object of child class
        Plane cp=new CargoPlane();
        cp.planeFlies();

    }
}
