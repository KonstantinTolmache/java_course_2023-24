package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Input name: ");
    String name = in.nextLine();
    System.out.println("Input year of birth: ");
    int year = in.nextInt();
    year = 2024-year ;
    System.out.println("Your name is " + name + " and your age is " + year + " years old");

    in.close();
}
}
