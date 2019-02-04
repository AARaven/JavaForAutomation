package ObjectBasics.OptionalTurtle;

import java.util.Arrays;

class TurtleGraphics {
    
    private static final char DEFAULT_COLORED_CELL_CHAR = 'o';
    private static final char DEFAULT_CELL_CHAR         = '.';
    private static final char DEFAULT_PEN_CHAR          = 'x';
    private static final int  X_DEFAULT_BOARD           = 9;
    private static final int  Y_DEFAULT_BOARD           = 9;
    
    private char     cellChar;
    private char     penChar;
    private char     coloredCellChar;
    private char[][] board;
    
    private Direction direction;
    private Position  position;
    
    Direction getDirection() {
        return this.direction;
    }
    
    void setDirection( Direction direction ) {
        this.direction = direction;
    }
    
    TurtleGraphics() {
        this.board = new char[ Y_DEFAULT_BOARD ][ X_DEFAULT_BOARD ];
        this.cellChar = DEFAULT_CELL_CHAR;
        this.coloredCellChar = DEFAULT_COLORED_CELL_CHAR;
        this.penChar = DEFAULT_PEN_CHAR;
        this.position = new Position();
    }
    
    TurtleGraphics( int heightBoard, int widthBoard, char cellChar, char penChar,
                    char coloredCellChar ) {
        this.board = new char[ heightBoard ][ widthBoard ];
        this.cellChar = cellChar;
        this.penChar = penChar;
        this.coloredCellChar = coloredCellChar;
        this.position = new Position();
    }
    
    void moveTurtle( Direction direction, int steps ) {
        
        switch ( direction ) {
            
            case UP:
                
                if ( ( this.position.getY_position() - steps ) <= 0 ) {
                    System.out.println( "\nOut of range!... " +
                                        "\nPlease, change your direction." );
                    
                    int temp_Y_Position = this.position.getY_position();
                    
                    while ( temp_Y_Position > 0 ) {
                        this.board[ temp_Y_Position ][ this.position.getX_position() ] =
                                coloredCellChar;
                        temp_Y_Position--;
                    }
                    
                } else {
                    
                    int temp_Y_Position = this.position.getY_position();
                    
                    for ( int i = 0; i < steps; i++ ) {
                        this.board[ temp_Y_Position ][ this.position.getX_position() ] =
                                coloredCellChar;
                        temp_Y_Position--;
                    }
                }
                
                this.position.setY_position(
                        ( ( this.position.getY_position() - steps ) <= 0 )
                        ? 0
                        : ( this.position.getY_position() - steps ) );
                break;
            
            case DOWN:
                
                if ( ( this.position.getY_position() + steps ) >= this.board.length ) {
                    System.out.println( "\nOut of range!... " +
                                        "\nPlease, change your direction." );
                    
                    int temp_Y_Position = this.position.getY_position();
                    
                    while ( temp_Y_Position < this.board.length ) {
                        this.board[ temp_Y_Position ][ this.position.getX_position() ] =
                                coloredCellChar;
                        temp_Y_Position++;
                    }
                    
                } else {
                    
                    int temp_Y_Position = this.position.getY_position();
                    
                    for ( int i = 0; i < steps; i++ ) {
                        this.board[ temp_Y_Position ][ this.position.getX_position() ] =
                                coloredCellChar;
                        temp_Y_Position++;
                    }
                }
                
                this.position.setY_position(
                        ( ( this.position.getY_position() + steps ) >= this.board.length )
                        ? this.board.length - 1
                        : ( this.position.getY_position() + steps ) );
                break;
            
            case LEFT:
                
                if ( ( this.position.getX_position() - steps ) <= 0 ) {
                    System.out.println( "\nOut of range!... " +
                                        "\nPlease, change your direction." );
                    
                    int temp_X_Position = this.position.getX_position();
                    
                    while ( temp_X_Position > 0 ) {
                        this.board[ this.position.getY_position() ][ temp_X_Position ] =
                                coloredCellChar;
                        temp_X_Position--;
                    }
                    
                } else {
                    
                    int temp_X_Position = this.position.getX_position();
                    
                    for ( int i = 0; i < steps; i++ ) {
                        this.board[ this.position.getY_position() ][ temp_X_Position ] =
                                coloredCellChar;
                        temp_X_Position--;
                    }
                }
                
                this.position.setX_position(
                        ( ( ( this.position.getX_position() - steps ) <= 0 )
                          ? 0
                          : this.position.getX_position() - steps ) );
                break;
            
            case RIGHT:
                
                if ( ( this.position.getX_position() + steps ) >= this.board.length ) {
                    System.out.println( "\nOut of range!... " +
                                        "\nPlease, change your direction." );
                    
                    int temp_X_Position = this.position.getX_position();
                    
                    while ( temp_X_Position < this.board.length - 1 ) {
                        this.board[ this.position.getY_position() ][ temp_X_Position ] =
                                coloredCellChar;
                        temp_X_Position++;
                    }
                    
                } else {
                    
                    int temp_X_Position = this.position.getX_position();
                    
                    for ( int i = 0; i < steps; i++ ) {
                        this.board[ this.position.getY_position() ][ temp_X_Position ] =
                                coloredCellChar;
                        temp_X_Position++;
                    }
                }
                
                this.position.setX_position(
                        ( ( this.position.getX_position() + steps ) >= this.board.length )
                        ? this.board.length - 1
                        : this.position.getX_position() + steps );
                break;
            
            case CLEAR:
                
                this.clearBoard();
                this.position.setX_position( this.position.X_DEFAULT_POSITION );
                this.position.setY_position( this.position.Y_DEFAULT_POSITION );
                break;
        }
    }
    
    void clearBoard() {
        for ( char[] chars : this.board ) {
            Arrays.fill( chars, this.cellChar );
        }
        System.out.println();
    }
    
    void showBoard() {
        char[][] board = this.board;
        for ( char[] chars : board ) {
            for ( char c : chars ) {
                System.out.print( c + " " );
            }
            System.out.println();
        }
    }
    
    void showTurtle() {
        this.board[ this.position.getY_position() ][ this.position.getX_position() ] = this.penChar;
    }
}
