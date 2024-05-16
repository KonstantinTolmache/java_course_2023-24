package lr6.Example8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrayInt = getMaxAndMinValue(1000,2000,100,200,500);
        System.out.println(Arrays.toString(arrayInt));
    }

    public static int[] getMaxAndMinValue(int ... v){

        Arrays.sort(v);

        int sumMas = 0;
        for (int i = 0; i < v.length; i++){
            sumMas = sumMas + v[i];
        }
        int averageMas = sumMas / v.length;
        System.out.println("Среднее арифметическое массива: " + averageMas);
        return v;
    }
}
