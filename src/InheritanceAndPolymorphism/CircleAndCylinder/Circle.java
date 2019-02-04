package InheritanceAndPolymorphism.CircleAndCylinder;

import java.util.Objects;

class Circle {
    
    protected static final double DEFAULT_RADIUS = 5.0;
    
    protected double radius;
    protected Colour colour;
    
    protected Circle() {
        this.setRadius( DEFAULT_RADIUS );
        this.setColour( Colour.DEFAULT );
    }
    
    protected Circle( double radius ) {
        this.setRadius( radius );
        this.setColour( Colour.DEFAULT );
    }
    
    protected Circle( double radius, Colour colour ) {
        this.setRadius( radius );
        this.setColour( colour );
    }
    
    protected double getRadius() {
        return this.radius;
    }
    
    protected double getArea() {
        return ( Math.PI * ( Math.pow( this.getRadius(), 2 ) ) );
    }
    
    protected Colour getColour() {
        return this.colour;
    }
    
    protected void setRadius( double radius ) {
        this.radius = radius;
    }
    
    protected void setColour( Colour colour ) {
        this.colour = colour;
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
               && this.getColour().equals( circle.getColour() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getRadius(), this.getColour() );
    }
    
    @Override
    public String toString() {
        return String.format( "\nThe radius of circle is : %.1f" +
                              "\n" +
                              "The colour of circle is : %s" +
                              "\n" +
                              "The area of circle is : %.1f" +
                              "\n",
                              this.getRadius(),
                              this.getColour().getDescription(),
                              this.getArea() );
    }
}
