
class static_keyword{

  static int i = 0; 
// initialized once only
  static_keyword(){
    i++;
    System.out.println(i);
  }
  void nothing(){}
  public static void main(String[] args) {
    static_keyword t = new static_keyword();
    static_keyword t1 = new static_keyword();
    static_keyword t2 = new static_keyword();
    t.nothing();
    t1.nothing();
    t2.nothing();
    
  }
}