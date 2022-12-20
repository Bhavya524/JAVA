package Patterns;
import java.util.*;
import java.lang.Math;

public class pattern20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, k;
        // int l=1;

        for(i=1; i<=n; i++){

            for(j=1; j<=(Math.abs(i-n)+1); j++){
                
                // int l;
                // l=i+j;
                System.out.print((i+j)-1+" ");

            }
            for(k=1; k < i ;k++){
     
            System.out.print(k + " ");  
            }  

            System.out.println();
        }

        
    }
}
