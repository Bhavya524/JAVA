package Patterns;
public class numberpattern {
    public static void main(String args[]){
        int n =5;
        int i, j ;
        int k=1;

        for(i=1; i<=n; i++){

            for(j=1; j<=i; j++){
                System.out.print(k++ + " ");
            }
            System.out.println();
        }

    }
}
