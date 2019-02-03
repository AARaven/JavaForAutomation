package InheritanceAndPolymorphism.Shapes;

import InheritanceAndPolymorphism.CircleAndCylinder.Colour;

import java.util.Objects;

class Circle extends Shape {
    
    private static final double DEFAULT_RADIUS = 1.0;
    
    private double radius;
    
    private double getRadius() {
        return this.radius;
    }
    
    private void setRadius( double radius ) {
        this.radius = radius;
    }
    
    double getArea() {
        return ( Math.PI * ( Math.pow( this.getRadius(), 2 ) ) );
    }
    
    Circle() {
        super();
        this.setRadius( DEFAULT_RADIUS );
    }
    
    Circle( double radius ) {
        super();
        this.setRadius( radius );
    }
    
    Circle( double radius, Colour colour, boolean filled ) {
        this.setRadius( radius );
        this.setColour( colour );
        this.setFilled( filled );
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Circle ) ) {
            return false;
        }
        
        Circle circle = ( Circle ) object;
        return this.getRadius() == circle.getRadius()
                && this.isFilled() == circle.isFilled()
                && this.getColour().equals( circle.getColour() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getRadius(),
                this.isFilled() );
    }
    
    @Override
    public String toString() {
        return String.format( "A Circle with radius = %.1f ;" +
                        "\nwhich is a subclass of %s",
                this.getRadius(),
                super.toString() );
    }
}
