package JavaFundamentals;

/**
 * <p><h2>Java Fundamentals Practice #2 : SearchElement for an element in the array.</h2></p>
 * <p>Implement a program that takes 2 integer numbers from the console:</p>
 * <p>------------------------------------------------------------------</p>
 * <p>--> <b>Array size</b>;</p>
 * <p>--> <b>A number to search in the array</b>.</p>
 * <p>------------------------------------------------------------------</p>
 * <p>Generate a random array of integers of provided size and print it.</p>
 * <p>Verify if the provided  element is present in the array.</p>
 * <p>If it does print true otherwise print false.</p>
 * <p>Use several algorithms. For example:</p>
 * <p>--> <b>Regular search one by one</b>;</p>
 * <p>--> <b>Binary search</b>.</p>
 * <p>Compare execution time for each algorithm.</p>
 * <p>-------------------------------------------------------------------</p>
 */
public class SearchElement {
    
    /**
     * Method that take the array of integers and searching the element
     * using 'binary search' algorithm
     * and print index of element if is present in the array, or print sorry msg
     *
     * @param ints  array of integers
     * @param value target value for searching
     */
    public void binarySearch( int[] ints, int value ) {
        int left   = 0;
        int right  = ints.length;
        int middle = ( left + right ) / 2;
        
        long binaryStart = System.nanoTime();
        
        while ( left != right || ( right - left ) != 1 ) {
            
            if ( ints[ middle ] > value ) {
                right = middle;
                middle = ( left + right ) / 2;
            } else if ( ints[ middle ] < value ) {
                left = middle;
                middle = ( left + right ) / 2;
            } else {
                break;
            }
        }
        
        long binaryEnd = System.nanoTime();
        
        if ( ints[ middle ] == value ) {
            System.out.printf( "\nElement '%d' stay on '%d' position in array.\n",
                               value,
                               middle + 1 );
            System.out.printf( "Execution time : %d ns", binaryEnd - binaryStart );
        } else {
            System.out.printf( "\nSorry, element '%d' is not present in the array.\n", value );
            System.out.printf( "Execution time : %d ns", binaryEnd - binaryStart );
        }
    }
    
    /**
     * Method that take the array of integers and searching the element
     * using regular 'step by step' algorithm
     * and print index of element if is present in the array, or print sorry msg
     *
     * @param ints  array of integers
     * @param value target value for searching
     */
    public void regularSearch( int[] ints, int value ) {
        int     position;
        boolean isPresent = false;
        
        long regularStart = System.nanoTime();
        
        for ( int i = 0; i < ints.length; i++ ) {
            
            if ( ints[ i ] == value ) {
                long regularEnd = System.nanoTime();
                position = i + 1;
                isPresent = true;
                System.out.printf( "\nElement '%d' stay on '%d' position in array. '%s'\n",
                                   value,
                                   position, isPresent );
                System.out.printf( "Execution time : %d ns", regularEnd - regularStart );
            }
        }
        
        long regularEnd = System.nanoTime();
        
        if ( !isPresent ) {
            System.out.printf( "\nSorry, element '%d' is not present in the array. '%s'\n",
                               value,
                               isPresent );
            System.out.printf( "Execution time : %d ns", regularEnd - regularStart );
        }
    }
}
