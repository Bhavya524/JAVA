
class student {
    int id;
    String name;
    public void fill(int i, String string) {
    }

}

public class object_class_ByRef {
    public object_class_ByRef() {
    }

    

    public static void main(String args[]) {
        // create objects
        student s1 = new student();
        student s2 = new student();

        // Initiallize objects OR store data into objects
        s1.id = 1;
        s2.id = 2;
        s1.name = "f";

        // printing data
        System.out.println(s1.id);
        System.out.println(s2.id);
        System.out.println(s2.name);

        System.out.println(" " + s1.name);

    }

}
