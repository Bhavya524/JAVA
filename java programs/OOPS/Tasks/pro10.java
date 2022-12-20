package Tasks;

class MEDICINE {
    private int MCODE;
    private String MNAME, MANUFACTURER;

    MEDICINE(int MCODE) {
        this.MCODE = MCODE;
    }

    MEDICINE(String MNAME, String MANUFACTURER) {
        this.MNAME = MNAME;
        this.MANUFACTURER = MANUFACTURER;
    }

    int McodeGetter() {
        System.out.print("MCODE :- ");
        return MCODE;
    }

    String StringGetter() {
        System.out.print("Manufacturer name:- ");
        return MNAME + " " + MANUFACTURER;
    }
}

public class pro10 {
    public static void main(String[] args) {
        MEDICINE m = new MEDICINE(232123);
        MEDICINE md = new MEDICINE("Aspirine--", "Apollo pharma");
        System.out.println(m.McodeGetter());
        System.out.println(md.StringGetter());
    }

}
