package Timus.timusN14_1639;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int m = in.nextInt();
        int n = in.nextInt();

        int result = (n * m) % 2;

        System.out.println((result!=0)? ("[second]=:]") : ("[:=[first]"));
    out.flush();
    }
}
