package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

import java.util.Objects;

class Square extends Rectangle {
    
    private static final double DEFAULT_SIDE = 0;
    
    private double side;
    
    private double getSide() {
        return this.side;
    }
    
    private void setSide( double side ) {
        this.side = side;
    }
    
    Square() {
        this.setSide( DEFAULT_SIDE );
    }
    
    Square( double side ) {
        this.setSide( side );
    }
    
    @Override
    double getPerimeter() {
        return 4 * getSide();
    }
    
    @Override
    double getArea() {
        return Math.pow( getSide(), 2 );
    }
    
    @Override
    boolean isInside( double x, double y ) {
        return x < getSide() && y < getSide();
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Square ) ) {
            return false;
        }
        
        Square square = ( Square ) object;
        return this.getSide() == square.getSide();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getSide() );
    }
    
    @Override
    public String toString() {
        return String.format( "A Square with side = %.1f , which is a subclass of %s"
                , this.getSide(), super.toString() );
    }
}
