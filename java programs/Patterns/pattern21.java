package Patterns;
import java.util.*;
// import java.lang.Math;  

public class pattern21 {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int i, j;
       
        
        

        for(i=1; i<=(2*n)-1; i++){

            for(j=1; j<=(2*n)-1; j++){

                // System.out.print(Math.max(Math.abs(i-n),Math.abs(j-n)) + 1 + " ");

                // absolute value logic
                int var1=n-i ,var2=n-j;

                if(var1<0 && var2<0){
                    var1=(-var1);
                    var2=(-var2);
                }
  
                else if (var1<0){
                    var1=(-var1);

                }
                else if(var2<0){
                    var2=(-var2);
                }
                
                
                else if(var1<0 || var2<0)  {
                    if (var1>0){
                        var1=(-var1);
                        
                    }
                    else{
                        var2=(-var2);
                    }

                    
                }
                
                
                
              


                // to find maximum
                if (var1>=var2){
                    System.out.print(var1 + 1 + " ");

                }
                else{
                    System.out.print(var2 + 1 + " ");
                }
               
                
                
                
            }
            System.out.println();
        }
        
    }
}
