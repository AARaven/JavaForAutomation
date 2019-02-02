package JavaFundamentals;

/**
 * -------------------------------------------------------------------------------------
 * <p><h2>Java Fundamentals Practice #3 : Sort array </h2></p>
 * <p>Sort random array ( number of arguments should be taken from in the console )
 * of integer numbers using at least 2 of the following sort algorithms:</p>
 * <p>
 * --------------------------------------------------------------------------------------
 * <p>--> <b>Bubble sort</b>;</p>
 * <p>--> <b>Optimized bubble sort</b>;</p>
 * <p>--> <b>insertion sort</b>;</p>
 * <p>--> <b>Selection sort</b>.</p>
 * <p>
 * --------------------------------------------------------------------------------------
 */

public class SortArray {
    
    private static boolean swapped;
    
    /**
     * Method that take 2 indexes of elements in the array and swap it
     *
     * @param arr       array of integers
     * @param firstVal  index of first element to swap
     * @param secondVal index of second element to swap
     */
    private void swap( int[] arr, int firstVal, int secondVal ) {
        int temp = arr[ firstVal ];
        arr[ firstVal ] = arr[ secondVal ];
        arr[ secondVal ] = temp;
    }
    
    private static boolean isSwapped() {
        return swapped;
    }
    
    private static void setSwapped( boolean value ) {
        swapped = value;
    }
    
    /**
     * Method that takes the array and sort him using the 'bubble sort' algorithm
     *
     * @param arr array of integers
     * @return sorted array of integers
     */
    public int[] bubbleSort( int[] arr ) {
        
        for ( int i = arr.length - 1; i > 0; i-- ) {
            for ( int j = 0; j < i; j++ ) {
                if ( arr[ j ] > arr[ j + 1 ] ) {
                    swap( arr, j, j + 1 );
                }
            }
        }
        return arr;
    }
    
    /**
     * Method that takes the array and sort him using the 'optimized bubble sort' algorithm
     *
     * @param arr array of integers
     * @return sorted array of integers
     */
    public int[] optimizedBubbleSort( int[] arr ) {
        
        for ( int i = 1; i < arr.length - 1; i++ ) {
            setSwapped( true );
            for ( int j = 0; j < arr.length - i; j++ ) {
                if ( arr[ j ] > arr[ j + 1 ] ) {
                    swap( arr, j, j + 1 );
                    setSwapped( false );
                }
            }
            if ( isSwapped() ) break;
        }
        return arr;
    }
    
    /**
     * Method that takes the array and sort him using the 'insertion sort' algorithm
     *
     * @param arr array of integers
     * @return sorted array of integers
     */
    public int[] insertionSort( int[] arr ) {
        
        for ( int i = 0; i < arr.length; i++ ) {
            int temp = arr[ i ];
            int j = i - 1;
            while ( j >= 0 && arr[ j ] > temp ) {
                arr[ j + 1 ] = arr[ j ];
                j = j - 1;
            }
            arr[ j + 1 ] = temp;
        }
        return arr;
    }
    
    /**
     * Method that takes the array and sort him using the 'selection sort' algorithm
     *
     * @param arr array of integers
     * @return sorted array of integers
     */
    public int[] selectionSort( int[] arr ) {
        
        for ( int i = 0; i < arr.length; i++ ) {
            int min = arr[ i ];
            int index = i;
            for ( int j = i + 1; j < arr.length; j++ ) {
                if ( arr[ j ] < min ) {
                    min = arr[ j ];
                    index = j;
                }
            }
            if ( i != index ) {
                swap( arr, i, index );
            }
        }
        return arr;
    }
}
