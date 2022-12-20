
/* Here super keyword for Constructor isn't nesecary bzc when 
 * we create object for child class automatically parent class will called
 * bzc of default constructor
 * 
 * for method we need to  use super keyword to call method from parent class
 * 
 * 
 */





class state{

    void prop(){
        System.out.println("big");
        System.out.println("huge population");
    }
    

    void leader(){
        System.out.println("  leader name ");
    }
}

class city extends state{
    {
        //  default constructor called city()
        super.leader();


    System.out.println("has many clubs");
    }
    
}


public class super_keyword {
    public static void main(String args[]){
        city c = new city();
        c.leader();

        
        

    }
}
