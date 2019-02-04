package JavaFundamentals;

/**
 * <p>----------------------------------------------------------------</p>
 * <p><h2>Java Fundamentals Practice #5 (Optional) : Towers of Hanoi</h2></p>
 * <p>----------------------------------------------------------------</p>
 * <p>There are 3 sticks "A", "B", "C". On the "A"<p> stick there are "n"(this number should be
 * taken
 * from the console)</p><p> disks, represented by integers from 1 to N ( where 1 is smallest and
 * n is the
 * biggest).</p>
 * <p> You should move the tower from "A" to "C" following the rule that each implement
 * a program that will take the number of disks and print the steps</p><p> required to move
 * the tower to the "C" stick</p> <p>(<b>example: " 1 moved from "A" to "C"</b>).</p>
 * <p>----------------------------------------------------------------</p>
 */

public class TowersOfHanoi {
    
    private int numberDisks;
    
    private int getNumberDisks() {
        return this.numberDisks;
    }
    
    private void calculationMoves( int numberDisks, String from, String to, String temp ) {
        if ( numberDisks != 0 ) {
            calculationMoves( numberDisks - 1, from, temp, to );
            System.out.println( numberDisks + " moved from " + from + " to " + to );
            calculationMoves( numberDisks - 1, temp, to, from );
        }
    }
    
    public void setNumberDisks( int value ) {
        this.numberDisks = value;
    }
    
    public void calculationMoves() {
        calculationMoves( this.numberDisks, "A", "C", "B" );
    }
    
    public void resultOfCalculation() {
        System.out.println( ( ( int ) ( ( Math.pow( 2, this.getNumberDisks() ) - 1 ) ) ) );
    }
}
