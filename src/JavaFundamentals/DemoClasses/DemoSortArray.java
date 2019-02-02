package JavaFundamentals.DemoClasses;

import JavaFundamentals.SortArray;
import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoSortArray {
    
    /**
     * Main menu
     */
    private void showMenu() {
        System.out.println( "\f\n******************************************" +
                "\n* 1 - Configure array.                   *" +
                "\n* 2 - Output array.                      *" +
                "\n* 3 - Sorting the array.                 *" +
                "\n* 4 - Exit.                              *" +
                "\n******************************************\n" );
    }
    
    /**
     * Secondary menu
     */
    private void showSecondaryMenu() {
        System.out.println( "\n*****************************************" +
                "\n* What's type of sort you want to use?  *" +
                "\n*****************************************" +
                "\n* 1 - Bubble sort.                      *" +
                "\n* 2 - Optimized bubble sort.            *" +
                "\n* 3 - Insertion sort.                   *" +
                "\n* 4 - Selection sort.                   *" +
                "\n*****************************************\n" );
    }
    
    public static void main( String[] args ) {
        DemoSortArray demo = new DemoSortArray();
        SortArray sort = new SortArray();
        Utils utils = new Utils();
        
        while ( true ) {
            
            demo.showMenu();
            
            try {
                
                switch ( utils.getScan().next() ) {
                    
                    case ( "1" ):
                        
                        utils.setArray();
                        break;
                        
                    case ( "2" ):
                        
                        utils.printArray();
                        break;
                    
                    case ( "3" ):
                        
                        demo.showSecondaryMenu();
                        
                        try {
                            
                            switch ( utils.getScan().next() ) {
                                
                                case ( "1" ):
                                    
                                    System.out.println( "\nSorting is complete.\n" );
                                    sort.bubbleSort( utils.getArray() );
                                    break;
                                
                                case ( "2" ):
                                    
                                    System.out.println( "\nSorting is complete.\n" );
                                    sort.optimizedBubbleSort( utils.getArray() );
                                    break;
                                
                                case ( "3" ):
                                    
                                    System.out.println( "\nSorting is complete.\n" );
                                    sort.insertionSort( utils.getArray() );
                                    break;
                                
                                case ( "4" ):
                                    
                                    System.out.println( "\nSorting is complete.\n" );
                                    sort.selectionSort( utils.getArray() );
                                    break;
                                
                                default:
                                    System.out.println( "\nIncorrect input ... " +
                                            "\nPlease, press 'Enter' to continue ..." );
                                    System.in.read();
                            }
                            
                        } catch ( NullPointerException e ) {
                            System.out.printf( "\nSorry, array is not created ... %s" +
                                            "\nPlease, create an array and try again.\n",
                                    e.getLocalizedMessage() );
                        }
                        
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
