package lr4;

import java.util.Random;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);

        System.out.print("введите количество  столбцов массива: ");
        int a = in.nextInt();
        System.out.print("введите количество строк массива: ");
        int b = in.nextInt();
        int[][] firstArray = new int[a][b];

        System.out.println("");
        System.out.println("До преобразования");

        for (int i = 0 ; i <a; i++) {
            for (int j = 0 ; j <b; j++) {
                firstArray[i][j] = random.nextInt(100);
                System.out.println("i="+i+"; j="+j+"; value="+firstArray[i][j]);
            }
        }
        System.out.println("");
        System.out.println("После преобразования");

        int[][] secondArray = new int[b][a];
        for (int i = 0 ; i <b; i++) {
            for (int j = 0 ; j <a; j++) {
                secondArray[i][j] = firstArray[j][i];
                System.out.println("i="+i+" ;j="+j+"; value="+secondArray[i][j]);
            }
        }
    }
}



