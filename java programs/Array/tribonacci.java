import java.util.*;

public class tribonacci {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("I/P : ");
        int n = sc.nextInt();
        sc.close();
        int a1 = 0, a2 = 1, a3 = 2, a4 = 0, i;
        System.out.println("O/P: ");

        if (n <= 3) {
            System.out.println(n - 1);

        } else {
            for (i = 3; i < n; i++) {
                a4 = a3 + a2 + a1;
                a1 = a2;
                a2 = a3;
                a3 = a4;
            }
            System.out.println(a4);
        }
    }
}
