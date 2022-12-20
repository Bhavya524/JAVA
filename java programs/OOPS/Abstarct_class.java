abstract class parent{
    void greet(){
        System.out.println(" Good early morning");}
        //Abstrsct method
    abstract void greet1();
    abstract void greet2(); 
}
// derived abstract class
abstract class child extends parent{
    abstract void greet1();
}

// concret of abstract class
class chlid1 extends child{
    void greet1(){
        System.out.println("Good Afternoon");
    }
    void greet2(){
        System.out.println("Good Evening");
    }
    
}

public class Abstarct_class {
   public static void main(String[] args) {
    
    
   }

}
