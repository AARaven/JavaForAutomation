package JavaFundamentals.DemoClasses;

import JavaFundamentals.TowersOfHanoi;
import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoTowersOfHanoi {
    
    private void showMenu() {
        System.out.println( "\f\n*********************************************************" +
                              "\n* 1 - To set a number of disks.                         *" +
                              "\n* 2 - To show the result of the calculation.            *" +
                              "\n* 3 - To demonstrate the calculations from A to C.      *" +
                              "\n* 4 - Exit.                                             *" +
                              "\n*********************************************************\n" );
    }
    
    public static void main( String[] args ) {
        DemoTowersOfHanoi demo = new DemoTowersOfHanoi();
        TowersOfHanoi towers = new TowersOfHanoi();
        Utils utils = new Utils();
        
        while ( true ) {
            
            demo.showMenu();
            
            try {
                
                switch ( utils.getScan().next() ) {
                    
                    case ( "1" ):
                        
                        System.out.println( "\nEnter the number of disks : " );
                        towers.setNumberDisks( utils.getScan().nextInt() );
                        break;
                    
                    case ( "2" ):
                        
                        System.out.print( "\nSteps : " );
                        towers.resultOfCalculation();
                        System.out.println( "\nPress 'ENTER' for continue ...\n" );
                        System.in.read();
                        break;
                    
                    case ( "3" ):
                        
                        towers.calculationMoves();
                        System.out.println( "\nPress 'ENTER' for continue ...\n" );
                        System.in.read();
                        break;
                    
                    case ( "4" ):
                        
                        System.out.println( "\nExiting ... \n" );
                        System.exit( 0 );
                        break;
                    
                    default:
                        
                        System.out.println( "\nIncorrect input ... " +
                                            "\nPlease, press 'Enter' to continue ...\n" );
                        System.in.read();
                        break;
                }
            } catch
            ( IOException | InputMismatchException e ) {
                System.out.printf( "\nIncorrect input ... %s " +
                                   "\nPlease, press 'Enter' to continue ... \n", e.getMessage() );
            }
        }
    }
}
