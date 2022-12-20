package Patterns;
public class mirrorpyramid {
    public static void main(String args[]){
        int n = 10;
        int i, j;

        for(i=n; i>=1; i--){

            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1; n>=i;i++){

            for(j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
