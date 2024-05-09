package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое целое число у которого при делении на 5 в остатке получается 2, а при делении на 7 в остатке получается 1");
        int x = in.nextInt();
        int result1 = x % 5;
        int result2 = x % 7;
        System.out.println("При делении на 5 = " + result1 + " При делении на 7 = " + result2);
                if (result1 == 2 & result2 == 1) {
            System.out.println("Введёное число удовлетворяет критериям");
        }else{
            System.out.println("Введёное число не удовлетворяет критериям");
        }

        }
}