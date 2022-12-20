package Patterns;
import java.util.*;
public class spacediamond{
    public static void main(String args[]){
        /*                    *
                            *   *
                          *   *   *
                            *   *
                              *
        
        */
        Scanner sc=new Scanner(System.in);
        System.out.print("rows:- ");
            int num = sc.nextInt();

            int i, j;

            for(i = 1; i <= num; i++){

                for(j = 1; j <= num - i ;j++){
                    System.out.print(" ");
                }
                for(j = 1; j <= i; j++){
                    System.out.print("*" + " ");
                }
                System.out.println();

            }
            for(i=num-1; i>0 ; i-- ){

                for(j=1; j<=num-i; j++){
                    System.out.print(" ");
                }
                
                for(j=1; j<=i; j++){
                    System.out.print("*" + " ");
                }
                
                System.out.println();

                }

            
                }
            }
    
