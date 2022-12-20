
interface Bike{
    int speed = 0;
    void applybrake(int decreace);
    void speedup(int increase);
}

interface Functionality{
    void brake_lights();
    void speed_sound();
    void motion_detect();
}
    //  -- Merge interface classes and implement it in real scenario
class Ninja implements Bike,Functionality{
    int speed = 95;

    public void applybrake(int decreace){
        speed = speed - decreace;
        System.out.println("Current speed " + speed);
    }

    public void speedup(int increase){
        speed = speed - increase;
        System.out.println("Current speed " + speed);
    }

    public void speed_sound(){
        System.out.println("hu tu tu... tu tuu tu..");
    }

    public void brake_lights(){
        System.out.println("Turn On back lights");
    }

    public void motion_detect(){
        System.out.println("Turning On parking lights with Horn ");
    }
}

public class Interface {
    public static void main(String[] args) {
        Ninja N = new Ninja();
         N.applybrake(5);
         System.out.println(N.speed);
         N.speedup(25);
         System.out.println(N.speed);
         N.brake_lights();
         N.motion_detect();
         N.speed_sound();

    }
    
}
