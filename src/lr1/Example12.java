package lr1;

import java.util.Scanner;

public class Example12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your age: ");
        int age = in.nextInt();
        age = 2024-age ;
        System.out.println("Your year of birth is " + age);

        in.close();
    }
}
