package JavaFundamentals.DemoClasses;

import JavaFundamentals.FindTheMinimum;
import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoFindTheMinimum {
    
    /**
     * Main menu
     */
    private void showMenu() {
        System.out.println( "\f\n*******************************************" +
                "\n* 1 - To find the lower of two values.    *" +
                "\n* 2 - To find the lower of three values.  *" +
                "\n* 3 - To find the lower of four values.   *" +
                "\n* 4 - Exit.                               *" +
                "\n*******************************************\n" );
    }
    
    public static void main( String[] args ) {
        DemoFindTheMinimum demo = new DemoFindTheMinimum();
        FindTheMinimum find = new FindTheMinimum();
        Utils utils = new Utils();
        
        while ( true ) {
            
            demo.showMenu();
            
            try {
                switch ( utils.getScan().next() ) {
                    /*
                     * case 1: using the method that takes 2 integer arguments and return lowest
                     */
                    case ( "1" ):
                        System.out.println( "\nPlease, enter the two values for find lowest." );
                        System.out.printf( "\nThe min is : %d.",
                                find.min( utils.getScan().nextInt(),
                                        utils.getScan().nextInt() ) );
                        System.out.println( "\nplease, press 'ENTER' to continue." );
                        System.in.read();
                        break;
                    /*
                     * case 2: using the method that takes 3 integer arguments and return lowest
                     */
                    case ( "2" ):
                        System.out.println( "\nPlease, enter the three values for find lowest." );
                        System.out.printf( "\nThe min is : %d.",
                                find.min( utils.getScan().nextInt(),
                                        utils.getScan().nextInt(),
                                        utils.getScan().nextInt() ) );
                        System.out.println( "\nplease, press 'ENTER' to continue." );
                        System.in.read();
                        break;
                    /*
                     * case 3: using the method that takes 4 integer arguments and return lowest
                     */
                    case ( "3" ):
                        System.out.println( "\nPlease, enter the four values for find lowest." );
                        System.out.printf( "\nThe min is : %d.",
                                find.min( utils.getScan().nextInt(),
                                        utils.getScan().nextInt(),
                                        utils.getScan().nextInt(),
                                        utils.getScan().nextInt() ) );
                        System.out.println( "\nplease, press 'ENTER' to continue." );
                        System.in.read();
                        break;
                    /*
                     * case 4: exit point from the program
                     */
                    case ( "4" ):
                        System.out.println( "\nExiting ...\n" );
                        System.exit( 0 );
                        break;
                    /*
                     *default section
                     */
                    default:
                        System.out.println( "\nIncorrect input ... " +
                                "\nPlease, press 'ENTER' to continue." );
                        System.in.read();
                }
            } catch
            ( IOException | InputMismatchException e ) {
                System.out.printf( "\nIncorrect input ... %s " +
                        "\nPress 'Enter' to continue ...", e.getMessage() );
            }
        }
    }
}
