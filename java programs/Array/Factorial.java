
public class Factorial {
    public static void main(String[] args) {
        int res = fac(10);
        System.out.println(res);
    }

    public static int fac(int n) {
        int x = 1;
        for (int i = n; i > 1; i--) {
            x = x * i;
            System.out.println(x);
        }
        return x;
    }

}
