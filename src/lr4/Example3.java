package lr4;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите любое целое число");

        int size = in.nextInt();
        for (int i = 0; i < size; i++)  {
            for (int j = 0; j < size + 10; j++)  {
                System.out.print("2");
            }
            System.out.println();
        }
    }
}
