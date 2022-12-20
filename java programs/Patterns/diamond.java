package Patterns;

public class diamond{
    public static void main(String args[]){
            int num = 1;
            /*
             *            *
             *           ***
             *          *****
             *           ***
             *            *
             */
            int i, j;

            for(i = 1; i <= num; i++){

                for(j = 1; j <= num - i ;j++){
                    System.out.print(" ");
                }
                for(j = 1; j <= (2 * i) - 1; j++){
                    System.out.print("*");
                }
                System.out.println();

            }
            for(i=num-1; i>0 ; i-- ){

                for(j=1; j<=num-i; j++){
                    System.out.print(" ");
                }
                
                for(j=1; j<=(2 * i)-1; j++){
                    System.out.print("*");
                }
                
                System.out.println();

                }

            
                }
            }
    
