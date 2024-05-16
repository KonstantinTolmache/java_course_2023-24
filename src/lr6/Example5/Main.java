package lr6.Example5;
import java.util.Scanner;

public class Main {
    public static int sum2(int n) {
        return n * (n + 1) * (2 * n + 1) / 6;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = 1;
        int b = in.nextInt();
        System.out.println("result = " + (sum2(b) - sum2(a - 1)));
    }
}