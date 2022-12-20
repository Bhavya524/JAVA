package Tasks;

class Employee {
    private int empno,salary;
    private String ename;

    Employee(){

    }
    Employee(int empno,int salary,String ename) {
        this.empno = empno;
        this.salary = salary;
        this.ename = ename;
    
    }

    
        

    void info(int empno) {
        System.out.println("Employee name:- "+ ename);
        System.out.println("Employee Number :- "+empno);
        System.out.println("salary :- " +salary);
    }

    void info(){
        System.out.println("Employee name:- "+ ename);
        System.out.println("Employee Number :- "+empno);
    }

    
}

public class pro5 {
    public static void main(String[] args) {
        Employee m = new Employee(44,7000,"Bhavya Patel");
        m.info();
        // -- all information
        m.info(4);

        
        
    }

}
