package InheritanceAndPolymorphism.Shapes;

import InheritanceAndPolymorphism.CircleAndCylinder.Colour;

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
        this.setColour( Colour.DEFAULT );
        this.setFilled( true );
        
    }
    
    Square( double side ) {
        this.setSide( side );
        this.setColour( Colour.DEFAULT );
        this.setFilled( true );
    }
    
    Square( double side, Colour colour, boolean filled ) {
        this.setSide( side );
        this.setColour( colour );
        this.setFilled( filled );
    }
    
    @Override
    protected double getPerimeter() {
        return 4 * this.getSide();
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
        return this.getSide() == square.getSide()
               && this.isFilled() == square.isFilled()
               && this.getColour().equals( square.getColour() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getSide(),
                             this.getColour(),
                             this.isFilled() );
    }
    
    @Override
    public String toString() {
        return String.format( "A Square with side = %.1f ;" +
                              "\nwhich is a subclass of %s",
                              this.getSide(),
                              super.toString() );
    }
}
