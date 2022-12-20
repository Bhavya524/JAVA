package Tasks;
class cons1{

    cons1(){
        // --- default
        System.out.println("Hey from cons1");
    }
}

class cons2 extends cons1{
    int x ;
    
    cons2(){
        // --- default
        super();
        System.out.println("Hey form cons2");
    }

    cons2(int x){
        this.x = x;
        System.out.println(x+" Using this keyword");
    }

    void nothing(){

    }


}


public class pro4 {
    public static void main(String[] args) {
        
        cons2 c2 = new cons2();
        cons2 c = new cons2(7);
        c2.nothing();
        c.nothing();
                
    }
    
}
