package Tasks;


abstract class vehicle{
    void noofWheel(){
        System.out.println(" vehicle can be driven");
    }

}
class Rikshaw extends vehicle{
    void noofWheel(){
        System.out.println(" vehicle can be driven");
    }
    
}
class Car extends Rikshaw{
    void noofWheel(){
        System.out.println(" vehicle can be driven");
    }
    
}
class Bus extends Car{
    void noofWheel(){
        System.out.println(" vehicle can be driven");
    }
    
}
public class pro3 {
    public static void main(String[] args) {
        vehicle R = new Rikshaw();
        vehicle C = new Car();
        vehicle B = new Bus();
        R.noofWheel();
        C.noofWheel();
        B.noofWheel();
        
        
    }
    
}
