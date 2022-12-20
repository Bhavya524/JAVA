import java.util.*;

class match{
    String name;
    float r;
    float b;
    float v;
    

    void StrikeRate(float r, float b){
        v = (r/b)*100;
        
        System.out.print("Strike Rate is : "+v);
    }
}

class object_class_Project1 {
    public static void main(String args[]){
        float r;
        float b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter runs : ");
        r = sc.nextInt();

        System.out.print("Enter balls : ");
        b = sc.nextInt();
        sc.close();
        
        match m = new match();
        m.StrikeRate(r, b);
    }
    
}
