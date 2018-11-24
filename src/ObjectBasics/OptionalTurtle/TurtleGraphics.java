package ObjectBasics.OptionalTurtle;

class TurtleGraphics {

    private static final int Y_DEFAULT_BOARD = 9;
    private static final int X_DEFAULT_BOARD = 9;
    private static final char DEFAULT_CELL_CHAR = '.';
    private static final char DEFAULT_COLORED_CELL_CHAR = 'o';
    private static final char DEFAULT_PEN_CHAR = 'x';

    private char[][] board;
    private char cellChar;
    private char penChar;
    private char coloredCellChar;

    private Position position;

    enum Direction{

         u{ }

        ,d{ }

        ,r{ }

        ,l{ }

        ,c{ },;

        String direction;

        protected String getDirection() {
            return direction;
        }

        protected void setDirectionName(String direction) {
            this.direction = direction;
        }
    }

    protected void moveTurtle(Direction direction) {

        switch (direction) {

            case u:

                if (this.position.getY_position() > 0) {
                    this.position.setY_position(this.position.getY_position() - 1);
                    break;
                } else if (this.position.getY_position() == 0) {
                    System.out.println("Out of range!... please re-change your direction");
                    break;
                }

            case d:

                if (this.position.getY_position() < this.board.length - 1) {
                    this.position.setY_position(this.position.getY_position() + 1);
                    break;
                }else if(this.position.getY_position() == this.board.length - 1)
                    System.out.println("Out of range!... please re-change your direction");
                    break;

            case l:

                if (this.position.getX_position() > 0) {
                    this.position.setX_position(this.position.getX_position() - 1);
                    break;
                } else if (this.position.getX_position() == 0) {
                    System.out.println("Out of range!... please re-change your direction");
                    break;
                }

            case r:

                if (this.position.getX_position() < this.board.length - 1) {
                    this.position.setX_position(this.position.getX_position() + 1);
                    break;
                } else if (this.position.getX_position() == this.board.length - 1) {
                    System.out.println("Out of range!... please re-change your direction");
                    break;
                }

            case c:

                this.clearBoard();
                this.position.setX_position(this.position.XDEFAULT_POSITION);
                this.position.setY_position(this.position.YDEFAULT_POSITION);
                break;
        }
    }

    TurtleGraphics() {

        this.board = new char[Y_DEFAULT_BOARD][X_DEFAULT_BOARD];
        this.cellChar = DEFAULT_CELL_CHAR;
        this.coloredCellChar = DEFAULT_COLORED_CELL_CHAR;
        this.penChar = DEFAULT_PEN_CHAR;
        this.position = new Position();
    }

    TurtleGraphics(int heightBoard,int widthBoard, char cellChar, char penChar, char coloredCellChar) {
        this.board = new char[heightBoard][widthBoard];
        this.cellChar = cellChar;
        this.penChar = penChar;
        this.coloredCellChar = coloredCellChar;
        this.position = new Position();

    }

    void clearBoard() {

        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j <this.board.length; j++) {
                this.board[i][j] = this.cellChar;
            }
            System.out.println();
        }
    }

    void showTurtle() {
        this.board[this.position.getY_position()][this.position.getX_position()] = this.penChar;
    }

    void showBoard() {
        char[][] board = this.board;
        for (char[] b : board) {
            for (int i = 0; i < this.board.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println();
        }
    }

    void turtleColor() {
        this.board[this.position.getY_position()][this.position.getX_position()] = this.coloredCellChar;
    }

    boolean isTurtleOnColor() {
        return this.board[this.position.getY_position()][this.position.getX_position()] == this.coloredCellChar;
    }

//    boolean isColoredBoard() {
//        for (int i = 0; i < this.board.length; i++) {
//            for (int j = 0; j < this.board.length; j++) {
//                if (this.board[i][j] == this.coloredCellChar && this.board[this.position.getY_position()][this.position.getX_position()] == this.penChar) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    void gameOver() {
        if (isTurtleOnColor()) {
            System.out.println("The game is over...");
            moveTurtle(Direction.c);
        }
    }

//    void winGame() {
//        if (isColoredBoard()) {
//            System.out.println("You winner!!!");
//            moveTurtle(Direction.c);
//        }
//    }
}
