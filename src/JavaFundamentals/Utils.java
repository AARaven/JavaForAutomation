package JavaFundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    
    private Scanner scan = new Scanner( System.in );
    private int[] array;
    
    private void fillArray() {
        for ( int i = 0; i < this.array.length; i++ ) {
            array[ i ] = scan.nextInt();
        }
    }
    
    public Scanner getScan() {
        return this.scan;
    }
    
    public void setScan( Scanner scan ) {
        this.scan = scan;
    }
    
    public int[] getArray() {
        return this.array;
    }
    
    public void setArray( int[] array ) {
        this.array = array;
    }
    
    public void setArray() {
        System.out.println( "\nEnter the size of array : " );
        this.array = new int[ scan.nextInt() ];
        System.out.println( "\nFill the array : " );
        fillArray();
    }
    
    public void printArray() {
        System.out.println( "\nArray : \n" + Arrays.toString( this.array ) );
    }
}
