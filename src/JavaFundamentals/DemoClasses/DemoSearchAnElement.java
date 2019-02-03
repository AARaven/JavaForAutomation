package JavaFundamentals.DemoClasses;

import JavaFundamentals.SearchElement;
import JavaFundamentals.SortArray;
import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoSearchAnElement {
    
    private void showElementSearchMenu() {
        System.out.println( "\n*****************************************" +
                            "\n* What's element need to find ?         *" +
                            "\n*****************************************\n" );
    }
    
    private void showTypeSearchMenu() {
        System.out.println( " \n*****************************************" +
                             "\n* What's method you need to use ?       *" +
                             "\n*****************************************" +
                             "\n* 1 - One by one.                       *" +
                             "\n* 2 - Binary.                           *" +
                             "\n*****************************************\n" );
    }
    
    private void showMenu() {
        System.out.println( "\f\n******************************************" +
                              "\n* 1 - Configure array.                   *" +
                              "\n* 2 - Output array.                      *" +
                              "\n* 3 - Change type for search.            *" +
                              "\n* 4 - Exit.                              *" +
                              "\n******************************************\n" );
    }
    
    public static void main( String[] args ) {
        DemoSearchAnElement demo = new DemoSearchAnElement();
        SearchElement search = new SearchElement();
        SortArray sort = new SortArray();
        Utils utils = new Utils();
        
        while ( true ) {
            
            demo.showMenu();
            
            try {
                
                switch ( utils.getScan().next() ) {
                    /*
                     * case 1: configure the array from user input
                     */
                    case ( "1" ):
                        utils.setArray();
                        break;
                    /*
                     * case 2: print the array
                     */
                    case ( "2" ):
                        utils.printArray();
                        break;
                    /*
                     * case 3: type of search section
                     */
                    case ( "3" ):
                        demo.showTypeSearchMenu();
                        
                        switch ( utils.getScan().next() ) {
                            /*
                             * case 1: using the regular search algorithm for searching the element
                             */
                            case ( "1" ):
                                demo.showElementSearchMenu();
                                search.regularSearch( utils.getArray(), utils.getScan().nextInt() );
                                break;
                            /*
                             * case 2: using the 'bubble sort' and 'binary search' algorithms
                             * for searching the element
                             */
                            case ( "2" ):
                                demo.showElementSearchMenu();
                                sort.bubbleSort( utils.getArray() );
                                search.binarySearch( utils.getArray(), utils.getScan().nextInt() );
                                break;
                            /*
                             * default section
                             */
                            default:
                                System.out.println( "\nIncorrect input ... " +
                                                    "\nPlease, press 'Enter' to continue ...\n" );
                                System.in.read();
                        }
                        
                        break;
                    /*
                     * case 4: exit point from program
                     */
                    case ( "4" ):
                        System.out.println( "\nExiting ... \n" );
                        System.exit( 0 );
                        break;
                    /*
                     * default section
                     */
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
