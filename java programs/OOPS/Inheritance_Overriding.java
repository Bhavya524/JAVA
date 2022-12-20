class car{
    int topspeed(){
        return 0;
        
    }
}
class creta extends car{
    int topspeed(){
        return 200;
    }
}
class swift extends car{
    int topspeed(){
        return 170;
    }

}
// over rided topspeed() method
// extends for inherit class
public class Inheritance_Overriding {

    public static void main(String[] args) {
        
        car c = new car();
        creta cr = new creta();
        swift s = new swift();
        System.out.println(c.topspeed() +" "+ cr.topspeed() + " "+ s.topspeed() );
    }
    
}
