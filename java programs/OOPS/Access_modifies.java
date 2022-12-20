class A{
    public void msg(){System.out.println("Hey from public, I am public hahaha... ");}
     void dftmsg(){System.out.println("Hey from default, I can be for only this package sorry");}
     protected void ptdmsg(){System.out.println("Hey from protected, I can be outside the package by using child class  ");}

}

public class Access_modifies {
    private void pvtmsg(){System.out.println("Hey from private, in the class only, that's why I am here SAD!!");}

    public static void main(String[] args) {

        Access_modifies d = new Access_modifies();
        d.pvtmsg();
        A a = new A();
        a.msg();
        a.ptdmsg();
        a.dftmsg();
    }
    
        
    
    
}
