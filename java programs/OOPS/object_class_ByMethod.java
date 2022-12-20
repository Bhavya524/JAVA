
class studentt{
    int num ;
    String name ;

    //method
    // Method Overloading
    // pass parameters into method
    public void fill(int num ,String name){
        
        System.out.println(num + " " + name);

    }
    // method overloading
    void fill(int num ,String name,String n){
        
        System.out.println(num + " " + name + n) ;

    }
}

class object_class_ByMethod {
    public static void main(String args[]){

        // create object
        student s1 = new student();

        // Initiallize object OR store data into object by using Method fill()
        s1.fill(7,"bhavya");

        // anonymous object
        studentt s2 ; 
        s2 = new studentt();
        s2.fill(8,"manya");

        

    }
    
}
