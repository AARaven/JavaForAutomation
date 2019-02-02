package ObjectBasics.OptionalTurtle;

class Position {
    
    final int X_DEFAULT_POSITION = 0;
    final int Y_DEFAULT_POSITION = 0;
    
    private int x_position;
    private int y_position;
    
    int getX_position() {
        return this.x_position;
    }
    
    int getY_position() {
        return this.y_position;
    }
    
    void setX_position( int x_position ) {
        this.x_position = x_position;
    }
    
    void setY_position( int y_position ) {
        this.y_position = y_position;
    }
    
    Position() {
    }
}
