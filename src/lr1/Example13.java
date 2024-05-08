package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input first number: ");
        int num1 = in.nextInt();
        System.out.println("Input second number: ");
        int num2 = in.nextInt();
        int num3;
        num3=num1 + num2;
        System.out.println("The sum of your numbers is " + num3);

        in.close();
    }
}
