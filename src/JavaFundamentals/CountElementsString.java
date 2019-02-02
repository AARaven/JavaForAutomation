package JavaFundamentals;

/**
 * ---------------------------------------------------------------------------------
 * <p><h2>Java Fundamentals Practice #4 : Count elements occurrences in a String</h2> </p>
 * ---------------------------------------------------------------------------------
 * <p>Implement a program that request an input of 1 symbol form the consoles</p>
 * <p> and counts a number
 * occurrences of this symbol in a pre-created text</p>
 * <p>and prints it to the console.</p>
 * <p>The text may be hard-coded as a String in your code.</p>
 * ----------------------------------------------------------------------------------
 */

public class CountElementsString {
    
    private String string;
    
    public String getString() {
        return this.string;
    }
    
    public void setString( String string ) {
        this.string = string;
    }
    
    public void printStringAsCharArray( String s ) {
        for ( char c : s.toCharArray() ) {
            System.out.print( "{" + c + "}" );
        }
        System.out.println();
    }
    
    public int findMatches( char x ) {
        int counter = 0;
        for ( char c : getString().toCharArray() ) {
            if ( c == x ) {
                counter++;
            }
        }
        return counter;
    }
}
