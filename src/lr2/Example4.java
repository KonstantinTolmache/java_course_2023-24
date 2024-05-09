package lr2;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число от 5 до 10 включительно");
        int x = in.nextInt();
                if (x < 11 & x > 4 ) {
            System.out.println("Введёное число удовлетворяет критериям");
        }else{
            System.out.println("Введёное число не удовлетворяет критериям");
        }
    }
}
