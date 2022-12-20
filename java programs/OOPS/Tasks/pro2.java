package Tasks;


class programmer {
    int pcode;
    String pname, skill;
    String pdetails;
    String pskills;

    programmer() {
        this.pname = "Bhavya";
        this.skill = "java";
        this.pcode = 64353;
    }

    // -- copy constructor
    programmer(programmer DETAILS) {
        pname = DETAILS.pname;
        skill = DETAILS.skill;
        pcode = DETAILS.pcode;

    }

    // -- details
    programmer(int pcode) {
        System.out.println(" -- DETAILS OF EMPLOYEE--");
        this.pdetails = "Bhavya P. Patel\n Address:- Chandkheda, Ahmedabad \n Mobile Number:- 95744532422";
        this.pskills = "SQL server management \n Ex.employee at Neo Fruition Technosol \n Google Certified Developer";

    }

    // -- method
    void Info() {
        System.out.println(" --CONTENT OF EMPLOYEE-- ");
        System.out.println("Programmer Name :  " + pname);
        System.out.println("skills of programmer : " + skill);
        System.out.println("programmer code : " + pcode);
    }

    void Info(int pcode) {
        System.out.println("Details:- " + pdetails);
        System.out.println();
        System.out.println("Skills:- " + pskills);

    }

}

public class pro2 {
    public static void main(String[] args) {
        programmer p1 = new programmer();
        p1.Info();
        System.out.println();
        programmer p2 = new programmer(3);
        p2.Info(3);

    }
}
