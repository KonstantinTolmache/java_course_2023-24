package lr6.Example9;

import java.util.Arrays;

public class Main {

    public static void arrayRevers( char[] chars ){

        for ( int i = 0; i < chars.length / 2; i++ ) {
            char tmp = chars[ i ];
            chars[ i ] = chars[ chars.length - i - 1 ];
            chars[ chars.length - i - 1 ] =  tmp;
        }

    }

    public static void main( String[] args ) {
        char[] chars = { 'e', 'i', 'c', 'g', 'a', 'f' };
        arrayRevers( chars );
        System.out.println( Arrays.toString( chars ));
    }

}
