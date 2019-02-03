package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

import java.util.Objects;

class Rectangle extends Shape {
    
    private static final double DEFAULT_WIDTH = 1.0;
    private static final double DEFAULT_LENGTH = 1.0;
    
    private double width;
    private double length;
    
    Rectangle() {
        this.width = DEFAULT_WIDTH;
        this.length = DEFAULT_LENGTH;
    }
    
    Rectangle( double width, double length ) {
        this.width = width;
        this.length = length;
    }
    
    private double getWidth() {
        return this.width;
    }
    
    private void setWidth( double width ) {
        this.width = width;
    }
    
    private double getLength() {
        return this.length;
    }
    
    private void setLength( double length ) {
        this.length = length;
    }
    
    double getPerimeter() {
        return ( 2 * ( this.getLength() + this.getWidth() ) );
    }
    
    double getArea() {
        return ( this.getLength() * this.getWidth() );
    }
    
    boolean isInside( double x, double y ) {
        return x < this.getWidth() && y < this.getLength();
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
                && this.getWidth() == rectangle.getWidth();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getLength(),
                this.getWidth() );
    }
    
    @Override
    public String toString() {
        return String.format( "A Rectangle with width = %.1f and length = %.1f , which a subclass of %s"
                ,
                this.width,
                this.length,
                super.toString() );
    }
}
