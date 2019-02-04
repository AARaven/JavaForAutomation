package InheritanceAndPolymorphism.Shapes;

import InheritanceAndPolymorphism.CircleAndCylinder.Colour;

import java.util.Objects;

class Rectangle extends Shape {
    
    private static final double DEFAULT_LENGTH = 1.0;
    private static final double DEFAULT_WIDTH  = 1.0;
    
    private double width;
    private double length;
    
    private double getWidth() {
        return this.width;
    }
    
    private double getLength() {
        return this.length;
    }
    
    private void setWidth( double width ) {
        this.width = width;
    }
    
    private void setLength( double length ) {
        this.length = length;
    }
    
    protected double getPerimeter() {
        return ( 2 * ( this.getLength() + this.getWidth() ) );
    }
    
    protected Rectangle() {
        super();
        this.setWidth( DEFAULT_WIDTH );
        this.setLength( DEFAULT_LENGTH );
    }
    
    protected Rectangle( double width, double length ) {
        super();
        this.setWidth( width );
        this.setLength( length );
    }
    
    protected Rectangle( double width, double length, Colour colour, boolean filled ) {
        this.setWidth( width );
        this.setLength( length );
        this.setColour( colour );
        this.setFilled( filled );
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Rectangle ) ) {
            return false;
        }
        
        Rectangle rectangle = ( Rectangle ) object;
        return this.getLength() == rectangle.getLength()
               && this.getWidth() == rectangle.getWidth()
               && this.isFilled() == rectangle.isFilled()
               && this.getColour().equals( rectangle.getColour() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getLength(),
                             this.getWidth(),
                             this.getColour(),
                             this.isFilled() );
    }
    
    @Override
    public String toString() {
        return String.format( "A Rectangle with width = %.1f and length = %.1f ;" +
                              "\nwhich a subclass of %s",
                              this.getWidth(),
                              this.getLength(),
                              super.toString() );
    }
}
