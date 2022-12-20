public class this_keyword {
    String x;

    // this keyword solve the confussion between class argument and method &
    // constructor parameter
    // to access class argument we use this.variable name

    this_keyword(String x) {
        this.x = x;
        System.out.println(x);

    }

    this_keyword(int x) {
        System.out.println(x);
    }

    this_keyword() {
        // -- put 5 into object by using this
        this(5);
        System.out.print(" I am from default  constructor");
    }
    void nothing(){

    }

    public static void main(String args[]) {
        // parameterized
        this_keyword ob = new this_keyword(3);

        this_keyword a = new this_keyword("Parameterized");

        this_keyword b = new this_keyword();

        // -- just for ignore error of not used resource
        ob.nothing();
        a.nothing();
        b.nothing();

        

    }
}
