package lr2;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число, больше 10, при этом нацело делится на 4");
        int x = in.nextInt();
                int result = x % 4;
                if (x > 10 & result == 0) {
            System.out.println("Введёное число удовлетворяет критериям");
        }else{
            System.out.println("Введёное число не удовлетворяет критериям");
        }
    }
}
