import java.util.*;

public class SumOfRowAndColumn {
    static int m;
    static int n;


    
    static void SumOfRow(int a[][]){

        int sum=0,i,j;
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){

                sum=sum+a[i][j];
                
            }
            System.out.println("the sum of "+(i+1)+" no. row is:- "+sum);
            sum=0;
        }
    }

    static void SumOfColumn(int a[][]){

        int sum=0,i,j;
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){

                sum=sum+a[j][i];
                
            }
            System.out.println("the sum of "+(i+1)+" no. column is:- "+sum);
            sum=0;
        }
    }













    public static void main(String args[]){

        int i,j;

        Scanner sc=new Scanner(System.in);

        System.out.print("Rows of matrix :- ");
        m = sc.nextInt();

        System.out.print("column of matrix :- ");
        n = sc.nextInt();


        

        int a[][]=new int[m][n];
        // a[0][0]=1;
        // a[0][1]=2;
        // a[0][2]=3;
        // a[1][0]=4;
        // a[1][1]=5;
        // a[1][2]=6;
        // a[2][0]=7;
        // a[2][1]=8;
        // a[2][2]=9;

        for(i=0; i<m; i++){
            for(j=0; j<n;j++){
                System.out.print(i + " " + j + " Cells data is:- ");

                int d;
                d=sc.nextInt();
                a[i][j]=d;
            }
        }

        System.out.println("Matrix as following:-  ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();

        }

        SumOfRow(a);

        SumOfColumn(a);




    

    }
}
