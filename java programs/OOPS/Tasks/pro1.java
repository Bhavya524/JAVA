package Tasks;


class student{
    int roll_number, Contact_number;
    String Name;

    student(int roll_number,int Contact_number,String Name){
        this.roll_number = roll_number;
        this.Contact_number = Contact_number;
        this.Name=Name;
    }


    void display(){
        System.out.println("Name :"+Name);
        System.out.println("Roll Number :"+roll_number);
        System.out.println("Contact Number :"+Contact_number);
        

    }
    
}
public class pro1 {
    public static void main(String[] args) {
        student s =new student(005,123456789,"Bhavya");
        s.display();
    
    }
    
}
