package Patterns;
public class hollowdiamond {
    public static void main(String args[]){
    int i,j,k;
    int row=3;

    for(i=1; i<=row; i++){

        // this for loop print spaces before stars
        for(j=1; j<=row-i; j++){
            System.out.print(" ");
        }

        // this for loop print only one start at first
        for(j=1; j<2; j++){
            System.out.print("*");
        }

        // k for loop used to add spaces between stars
        for(k=1; k<2*(i-1);k++){
            System.out.print(" ");
        }

        // if i=1 then no star because there are only one star
        if( i==1 )   
        {   
            System.out.println("");  
        }  
        else  
        {  
            System.out.println("*");   
        }  
        
    }
        
  }
}

