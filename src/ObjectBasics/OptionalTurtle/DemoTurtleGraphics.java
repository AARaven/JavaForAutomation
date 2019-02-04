package ObjectBasics.OptionalTurtle;

import JavaFundamentals.Utils;

import java.io.IOException;
import java.util.InputMismatchException;

public class DemoTurtleGraphics {
    
    private void showTitleMenu() {
        System.out.println(
                "\f\n*********************************************" +
                "\n* 1 - Play with turtle.                     *" +
                "\n* 2 - Exit.                                 *" +
                "\n*********************************************" +
                "\n" );
    }
    
    public static void main( String[] args ) throws Exception {
        
        DemoTurtleGraphics demo  = new DemoTurtleGraphics();
        Utils              utils = new Utils();
        TurtleGraphics     turtle;
        
        while ( true ) {
            
            demo.showTitleMenu();
            
            switch ( utils.getScan().next() ) {
                
                case ( "1" ):
                    
                    System.out.println( "\n'1' - to start the game with default properties. " +
                                        "\n'2' - to change the game board." );
                    
                    switch ( utils.getScan().next() ) {
                        
                        case ( "1" ):
                            turtle = new TurtleGraphics();
                            turtle.clearBoard();
                            break;
                        
                        case ( "2" ):
                            System.out.println( "\nConfigure your board: " +
                                                "\nFor example: 20 20 . x o" );
                            
                            turtle = new TurtleGraphics(
                                    utils.getScan().nextInt(),
                                    utils.getScan().nextInt(),
                                    utils.getScan().next().charAt( 0 ),
                                    utils.getScan().next().charAt( 0 ),
                                    utils.getScan().next().charAt( 0 ) );
                            
                            turtle.clearBoard();
                            break;
                        
                        default:
                            turtle = new TurtleGraphics();
                            turtle.clearBoard();
                    }
                    
                    while ( true ) {
                        
                        try {
                            
                            turtle.showTurtle();
                            turtle.showBoard();
                            
                            System.out.println(
                                    "\nChoose the description of movement and the number of " +
                                    "steps: " +
                                    "\nFor example: 'r 5' - to go 5 steps to the right." +
                                    "\n'c' - to clean a board and start again." +
                                    "\n'exit' - exit from the program" +
                                    "\n" );
                            
                            switch ( utils.getScan().next() ) {
                                
                                case ( "u" ):
                                    turtle.setDirection( Direction.UP );
                                    turtle.getDirection().move( turtle, utils.getScan().nextInt() );
                                    break;
                                
                                case ( "d" ):
                                    turtle.setDirection( Direction.DOWN );
                                    turtle.getDirection().move( turtle, utils.getScan().nextInt() );
                                    break;
                                
                                case ( "l" ):
                                    turtle.setDirection( Direction.LEFT );
                                    turtle.getDirection().move( turtle, utils.getScan().nextInt() );
                                    break;
                                
                                case ( "r" ):
                                    turtle.setDirection( Direction.RIGHT );
                                    turtle.getDirection().move( turtle, utils.getScan().nextInt() );
                                    break;
                                
                                case ( "c" ):
                                    turtle.setDirection( Direction.CLEAR );
                                    turtle.getDirection().clearBoard( turtle );
                                    break;
                                
                                case ( "exit" ):
                                    System.out.print( "\nExiting ..." +
                                                      "\n" );
                                    System.exit( 0 );
                                    break;
                                
                                default:
                                    System.out.println( "\nIncorrect input ... " +
                                                        "\nPlease, press 'Enter' to continue ..." +
                                                        "\n" );
                                    System.in.read();
                            }
                            
                        } catch
                        ( IOException | InputMismatchException e ) {
                            System.out.printf( "\nIncorrect input ... %s " +
                                               "\nPlease, press 'Enter' to continue ... " +
                                               "\n",
                                               e.getMessage() );
                        }
                    }
                
                case ( "2" ):
                    System.out.print( "\nExiting ..." +
                                      "\n" );
                    System.exit( 0 );
                    break;
                
                default:
                    System.out.println( "\nIncorrect input ... " +
                                        "\nPlease, press 'Enter' to continue ..." +
                                        "\n" );
                    System.in.read();
            }
        }
    }
}
