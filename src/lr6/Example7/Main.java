package lr6.Example7;

import java.util.Arrays;

public class Main {
    public static int[] retRef( char[] chars ){

        int[] intArray = new int[ chars.length ];

        for ( int i = 0; i < chars.length ; i++ ) {
            intArray[ i ] = chars[ i ];
        }
        return intArray;
    }

    public static void main( String[] args ) {

        char[] chars = { 'e', 'i', 'c', 'g', 'a', 'f' };
        int[] refArray = retRef( chars );
        System.out.println( Arrays.toString( refArray ));

    }
}