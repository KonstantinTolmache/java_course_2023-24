package lr6.Example4;

public class Main {

    static int doubleFactorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return n * doubleFactorial(n - 2);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println(doubleFactorial(n));
    }
}