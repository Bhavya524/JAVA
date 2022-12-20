class rough{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    rough(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  

    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    rough s1 = new rough(111,"Karan");  
    rough s2 = new rough(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  
