package JavaFundamentals.DemoClasses;

import JavaFundamentals.CountElementsString;
import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoCountElementString {
    
    private void showMenu() {
        System.out.println( "\f\n*******************************************" +
                "\n* 1 - To create a String.                 *" +
                "\n* 2 - To show the String as array.        *" +
                "\n* 3 - To find the matches.                *" +
                "\n* 4 - Exit.                               *" +
                "\n*******************************************\n" );
    }
    
    public static void main( String[] args ) {
        DemoCountElementString demo = new DemoCountElementString();
        CountElementsString count = new CountElementsString();
        Utils utils = new Utils();
        
        while ( true ) {
            
            demo.showMenu();
            
            try {
                
                switch ( utils.getScan().nextLine() ) {
                    
                    case ( "1" ):
                        count.setString( utils.getScan().nextLine() );
                        break;
                    
                    case ( "2" ):
                        count.printStringAsCharArray( count.getString() );
                        break;
                    
                    case ( "3" ):
                        System.out.printf( "We find : %d matches in your string.",
                                count.findMatches( utils
                                        .getScan()
                                        .next()
                                        .charAt( 0 ) ) );
                        break;
                    
                    case ( "4" ):
                        System.out.println( "\nExiting ... \n" );
                        System.exit( 0 );
                        break;
                    
                    default:
                        System.out.println( "\nIncorrect input ... " +
                                "\nPlease, press 'Enter' to continue ...\n" );
                        System.in.read();
                }
                
            } catch
            ( IOException | InputMismatchException e ) {
                System.out.printf( "\nIncorrect input ... %s " +
                        "\nPlease, press 'Enter' to continue ... \n", e.getMessage() );
            }
        }
    }
}
