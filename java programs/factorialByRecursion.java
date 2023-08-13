public class factorialByRecursion {

  public static void main(String[] args) {
        int n = factorial(10);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n > 1)
            return n * factorial(n - 1);
        else
            return 1;
    }
}