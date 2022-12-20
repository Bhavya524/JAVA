package Patterns;
import java.util.*;
public class alphabetpattern {
    public static void main(String args[]){
        Scanner SC= new Scanner(System.in);
        int n= SC.nextInt();
        int i, k;
        // j=(n-2);
        SC.close();

        for(i=1; i<=n; i++){

                if ( i==1 || i==n/2+1){
                    for(k=1; k<=n/2+1; k++){
                        System.out.print("*");

                    }   
                }
                else{
                                        // System.out.print("*"+j*" "+"*");

                    System.out.print("*"+"   "+"*");

                }
                System.out.println();
            
        }
    }
    
    
}
