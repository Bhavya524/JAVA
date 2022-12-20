import java.util.*;
public class OneDieArrayInput {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        System.out.println("Total elements:- ");

        int n = sc.nextInt();
        int s[]=new int[n];
        
        
        for(int j=0; j<n; j++){
            int d;
            System.out.print("Number "+j+" is :- ");
            d=sc.nextInt();
            s[j]=d;
        }
        System.out.println("The array is:- ");
        for (int i=0; i<n;i++){
            System.out.println(s[i]);
        }
        sc.close();

    }
}
        

    

