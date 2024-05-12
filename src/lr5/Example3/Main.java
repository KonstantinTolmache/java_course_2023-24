package lr5.Example3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите num1");
        int int1 = in.nextInt();
        System.out.println("Введите num2");
        int int2 = in.nextInt();
        Task1 myexample1 = new Task1();
        Task1 myexample2 = new Task1(int1);
        Task1 myexample3 = new Task1(int1,int2);
    }
}
