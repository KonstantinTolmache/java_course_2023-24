package lr4;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("введите количество строк массива: ");
        int a = in.nextInt();
        System.out.print("введите количество столбцов массива: ");
        int b = in.nextInt();
        int[][] ArraySnake = new int[a][b];
        int tale = 0;
        int body = 0;
        int h = 0;
        for (int i = 0; h < ArraySnake.length ; h++) {
            for (int j = 0; j <(ArraySnake[i].length - tale); j++) {
                ArraySnake[i][j] = body;
                body++;
            }
            if(i< ArraySnake.length-1) {
                i++;}
            for (int o=a-1; o > tale; o--) {
                ArraySnake[o][ArraySnake[i].length-1-tale] = body;
                body++;
            }
            tale++;
        }
        int z = 0;
        for (int i = 0; i < ArraySnake.length; i++){
            int count = i+1;
            System.out.print("номер строки " + count + " : ");
            for (int j = 0; j < ArraySnake[i].length; j++){
                System.out.print(ArraySnake[i][j]+" ");
                z++;
            }
            System.out.println(" Количество символов в строке " + z);
            z = 0;
        }
    }
}
