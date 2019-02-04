package Exсeptions;

import java.util.Random;

class OutOfBounds {
    
    public static void main( String[] args ) {
        
        Random rand  = new Random();
        int[]  array = new int[ 10 ];
        
        try {
            for ( int i = 0; i < array.length + 1; i++ ) array[ i ] = rand.nextInt( 100 );
            for ( int i : array ) System.out.println( i );
        } catch ( ArrayIndexOutOfBoundsException e ) {
            System.out.println( e + "\n" + "The ArrayIndexOutOfBoundsException is caught!!!" );
        }
    }
}
