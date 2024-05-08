package lr1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input year of birth: ");
        int year = in.nextInt();
        year = 2024-year ;
        System.out.println("Your age " + year + " years old");

        in.close();
    }
}