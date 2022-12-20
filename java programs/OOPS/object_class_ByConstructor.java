
class object_class_ByConstructor {
    int id;
    String name;
    String val = "non parameterized";

   
// Using constructor we can pass parameters into the object
// constractor overloading
    // default constructor called automatically when no para. pass into the object
    
    object_class_ByConstructor(){
        id=5;
        name = "Default constructor called";

    }

    // parameterized constructor 
    object_class_ByConstructor(int i, String n) {
        id = i;
        name = n;
    }


    public static void main(String args[]) {
        // creating objects and passing values


        // parameterized constuctor
        object_class_ByConstructor s1 = new object_class_ByConstructor(11, "Parameterized");
        System.out.println(s1.id + " " + s1.name);

        // Default constructor
        object_class_ByConstructor s = new object_class_ByConstructor();
        System.out.println(s.id + " " + s.name);


    }
}
