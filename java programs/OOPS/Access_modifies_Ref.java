public class Access_modifies_Ref {
    int i;
    /**
     * @param args
     */
    public static void main(String[] args) {
      // reference got from Access_modifies file
      A a = new A();
      a.msg();
      // reference got from object_class_ByMethod
      student s = new student();
      s.fill(5,"f");
    }
     
    } 
    