package Patterns;
import java.util.*;

public class sandglass {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        // int k=1;

        for(i=n; 1<=i; i--){

            for(j=1; j<=(n+1)-i; j++){
                System.out.print(" ");
            }
            for(j=i; 1<=j; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
        for(i=1; i<=n; i++){

            for(j=n; j>=i; j--){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        
    }
   
}
