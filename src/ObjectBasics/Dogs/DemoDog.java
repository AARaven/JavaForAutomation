package ObjectBasics.Dogs;

import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

class DemoDog {
    
    private void showMainMenu() {
        
        System.out.println(
                "\f\n********************************************" +
                        "\n* 1 - Dogs creator.                        *" +
                        "\n* 2 - Dogs randomizer.                     *" +
                        "\n* 3 - Show dogs.                           *" +
                        "\n* 4 - Sort dogs.                           *" +
                        "\n* 5 - Exit.                                *" +
                        "\n********************************************\n" );
    }
    
    private void showRandomMenu() {
        System.out.println(
                "\f\n***********************************************" +
                        "\n*                Dogs creator                 *" +
                        "\n***********************************************" +
                        "\n*       How many dogs you want to create ?    *" +
                        "\n*                                             *" +
                        "\n***********************************************\n" );
    }
    
    private void showSortingMenu() {
        System.out.println(
                "\f\n***********************************************" +
                        "\n*                Dogs sorting                 *" +
                        "\n***********************************************" +
                        "\n*     1 - By age.                             *" +
                        "\n*     2 - By name.                            *" +
                        "\n*     3 - By size.                            *" +
                        "\n*     4 - Back to main.                       *" +
                        "\n***********************************************\n" );
    }
    
    public static void main( String[] args ) {
        DemoDog demo = new DemoDog();
        Utils utils = new Utils();
        Dog dog = new Dog();
        
        while ( true ) {
            
            demo.showMainMenu();
            
            try {
                
                switch ( utils.getScan().nextLine() ) {
                    
                    case ( "1" ):
                        demo.showRandomMenu();
                        dog.setDogs(
                                dog.dogsCreator( utils.getScan() ) );
                        System.out.println(
                                "\nPress 'ENTER' for continue ...\n" );
                        System.in.read();
                        break;
                    
                    case ( "2" ):
                        demo.showRandomMenu();
                        dog.setDogs( dog.dogsGenerator( Integer.parseInt( utils.getScan().nextLine() ) ) );
                        System.out.println(
                                "\nPress 'ENTER' for continue ...\n" );
                        System.in.read();
                        break;
                    
                    case ( "3" ):
                        
                        dog.printDogs( dog.getDogs() );
                        System.out.println(
                                "\nPress 'ENTER' for continue ...\n" );
                        System.in.read();
                        break;
                    
                    case ( "4" ):
                        demo.showSortingMenu();
                        
                        switch ( utils.getScan().nextLine() ) {
                            
                            case ( "1" ):
                                System.out.println(
                                        "\nWhat's order you choice?" +
                                                "\n'1' - natural." +
                                                "\n'2' - reverse." );
                                
                                switch ( utils.getScan().nextLine() ) {
                                    
                                    case ( "1" ):
                                        dog.sortByAge( dog.getDogs(), "natural" );
                                        System.out.println(
                                                "\nCompleted ... \n" );
                                        break;
                                    
                                    case ( "2" ):
                                        dog.sortByAge( dog.getDogs(), "reverse" );
                                        System.out.println(
                                                "\nCompleted ... \n" );
                                        break;
                                    
                                    default:
                                        System.out.println(
                                                "\nIncorrect input ... " +
                                                        "\nPlease, press 'Enter' to continue ...\n" );
                                        System.in.read();
                                }
                                break;
                            
                            case ( "2" ):
                                System.out.println( "" +
                                        "\nWhat's order you choice?" +
                                        "\n'1' - natural." +
                                        "\n'2' - reverse." );
                                
                                switch ( utils.getScan().nextLine() ) {
                                    
                                    case ( "1" ):
                                        dog.sortByName( dog.getDogs(), "natural" );
                                        System.out.println(
                                                "\nCompleted ... \n" );
                                        break;
                                    
                                    case ( "2" ):
                                        dog.sortByName( dog.getDogs(), "reverse" );
                                        System.out.println(
                                                "\nCompleted ... \n" );
                                        break;
                                    
                                    default:
                                        System.out.println(
                                                "\nIncorrect input ... " +
                                                        "\nPlease, press 'Enter' to continue ...\n" );
                                        System.in.read();
                                }
                                break;
                            
                            
                            case ( "3" ):
                                System.out.println(
                                        "\nWhat's order you choice?" +
                                                "\n'1' - natural." +
                                                "\n'2' - reverse." );
                                
                                switch ( utils.getScan().nextLine() ) {
                                    
                                    case ( "1" ):
                                        dog.sortBySize( dog.getDogs(), "natural" );
                                        System.out.println(
                                                "\nCompleted ... \n" );
                                        break;
                                    
                                    case ( "2" ):
                                        dog.sortBySize( dog.getDogs(), "reverse" );
                                        System.out.println(
                                                "\nCompleted ... \n" );
                                        break;
                                    
                                    default:
                                        System.out.println(
                                                "\nIncorrect input ... " +
                                                        "\nPlease, press 'Enter' to continue ...\n" );
                                        System.in.read();
                                }
                                break;
                            
                            case ( "4" ):
                                continue;
                            
                            default:
                                System.out.println(
                                        "\nIncorrect input ... " +
                                                "\nPlease, press 'Enter' to continue ...\n" );
                                System.in.read();
                            
                        }
                        System.out.println(
                                "\nPress 'ENTER' for continue ...\n" );
                        System.in.read();
                        break;
                    
                    case ( "5" ):
                        System.out.println(
                                "\nExiting ... \n" );
                        System.exit( 0 );
                        break;
                    
                    default:
                        System.out.println(
                                "\nIncorrect input ... " +
                                        "\nPlease, press 'Enter' to continue ...\n" );
                        System.in.read();
                }
                
            } catch
            ( IOException | InputMismatchException | NullPointerException | IllegalArgumentException e ) {
                System.out.printf(
                        "\nIncorrect input ... %s " +
                                "\nPlease, press 'Enter' to continue ... \n", e.getMessage() );
            }
        }
    }
}
