package lr1;

import java.util.Scanner;

public class Examole14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int num2 = in.nextInt();
        int num1,num3,num4;
        num1=num2-1;
        System.out.print(num1);
        num3=num2+1;
        System.out.println(num2);
        System.out.println(num3);
        num4=num1+num2+num3;
        System.out.println(num1  num4);

        in.close();
    }
}
