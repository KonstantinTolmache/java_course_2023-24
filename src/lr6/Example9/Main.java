package lr6.Example9;

import java.util.Arrays;

public class Main {

    public static void getMaxAndMinValue( char[] chars ){
        Arrays.sort( chars );
        System.out.println( chars );
        System.out.println( Arrays.toString( chars ));
    }

    public static void main( String[] args ) {
        char[] chars = { 'e', 'd', 'c', 'b', 'a' };
        getMaxAndMinValue( chars );
    }

}
