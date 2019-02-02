package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

import java.util.Objects;

class Square extends Rectangle {
    
    protected Square() {
        this.width = DEFAULT_WIDTH;
        this.length = DEFAULT_LENGTH;
    }
    
    protected Square( double side ) {
        this.width = side;
        this.length = side;
    }
    
    private Square( double side, String colour, boolean filled ) {
        this.width = side;
        this.length = side;
    }
    
    private void setLength( double side ) {
        this.length = side;
        this.width = side;
    }
    
    private void setWidth( double side ) {
        this.width = side;
        this.length = side;
    }
    
    @Override
    public void printLengthOfCircumference() {
        System.out.print( "The square has no circumference !!! " + "\n" );
    }
    
    @Override
    public String toString() {
        return String.format( "A Square with side = %.1f , which is a subclass of %s"
                , this.length, super.toString() );
    }
    
    @Override
    public boolean equals( Object obj ) {
        
        if ( this == obj ) {
            return true;
        }
        
        if ( !( obj instanceof Square ) ) {
            return false;
        }
        
        Square square = ( Square ) obj;
        return this.length == square.length
                && this.width == square.width;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.length, this.width );
    }
}
