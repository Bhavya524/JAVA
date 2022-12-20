
public class Encapsulation {
    private long Reg_No;
    private String Model_Name;

    // -- set value by setter
    public void Set_Reg_No(long Reg_No) {
        this.Reg_No = Reg_No;
    }

    // -- get value by getter
    public long Get_Reg_No() {
        return Reg_No;
    }

    public void Set_Model_Name(String Model_Name) {
        this.Model_Name = Model_Name;
    }

    public String Get_Model_Name() {
        return Model_Name;
    }

    public static void main(String[] args) {
        Encapsulation E = new Encapsulation();
// why it does not allows me to store long value even though I assign long up in variable
        E.Set_Reg_No(922337203);
        E.Set_Model_Name("Creta");

        
        System.out.println(E.Get_Model_Name() + " " + E.Get_Reg_No());

    }

}
