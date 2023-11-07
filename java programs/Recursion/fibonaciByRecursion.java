public class fibonaci {
    static int fst = 0;
    static int sec = 1;
    static int third;
public static void main(String args[]){
    int result = 10;
    System.out.print(fst + " " + sec);
    fibonaci(result-2);
}
public static void fibonaci(int n){
if(n>0){
    third = fst + sec;  
    fst = sec;
    sec = third;
    System.out.print(" "+third);
    fibonaci(n - 1);
}
}
    
}
