package JavaFundamentals;

/**
 * ---------------------------------------------------------------------------------------
 *
 * <p><h2>Java Fundamentals Practice #1 : Find the minimum</h2></p>
 * <p>Create the following methods:</p>
 * <p>
 * ---------------------------------------------------------------------------------------
 * <p>--> The method that takes 2 integer arguments and returns the lowest; </p>
 * <p>--> The method that takes 3 integer arguments and returns the lowest ( using the first
 * method );</p>
 * <p>--> The method that takes 4 integer arguments and returns the lowest ( using previous
 * method );</p>
 * <p>
 * ---------------------------------------------------------------------------------------
 */

public class FindTheMinimum {
    
    /**
     * Method that takes 2 integer arguments and return the lowest
     *
     * @param first  integer to equalize
     * @param second integer to equalize
     * @return lowest value
     */
    public int min( int first, int second ) {
        return ( first < second )
               ? first
               : second;
    }
    
    /**
     * Method that takes 3 integer arguments and return the lowest
     *
     * @param first  integer to equalize
     * @param second integer to equalize
     * @param third  integer to equalize
     * @return lowest value
     */
    public int min( int first, int second, int third ) {
        return ( ( min( first, second ) ) < third )
               ? min( first, second )
               : third;
    }
    
    /**
     * Method that takes 4 integer arguments and return the lowest
     *
     * @param first  integer to equalize
     * @param second integer to equalize
     * @param third  integer to equalize
     * @param fourth integer to equalize
     * @return lowest value
     */
    public int min( int first, int second, int third, int fourth ) {
        return ( ( min( first, second, third ) ) < fourth
                 ? min( first, second, third )
                 : fourth );
    }
}
