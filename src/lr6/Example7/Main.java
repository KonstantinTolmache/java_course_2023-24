package lr6.Example7;

import java.util.Arrays;

public class Main {
    public static void main( String[] args ) {
        char[] chars = { 'e', 'i', 'c', 'g', 'a', 'f' };
        arrayRevers( chars );
        System.out.println( Arrays.toString( chars ));
    }

    public static int[] arrayRevers(char[] chars) {

            int[] ints = new int[chars.length];
            for (int i = 0; i < chars.length; i++) {
                ints[i] = Integer.parseInt(String.valueOf(chars[i]));
            }
            return ints;
    }
}
