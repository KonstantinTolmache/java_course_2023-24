package Timus.timusN6_1877;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int code1 = in.nextInt();
        int code2 = in.nextInt();

        if (code1 % 2 == 0 || code2 % 2 != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
