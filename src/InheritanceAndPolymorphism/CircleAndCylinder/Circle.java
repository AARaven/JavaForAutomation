package InheritanceAndPolymorphism.CircleAndCylinder;

import java.util.Objects;

class Circle {
    
    static final double DEFAULT_RADIUS = 5.0;
    protected double radius;
    protected Colour colour;
    
    public enum Colour {
        BLACK( "Black colour" ), RED( "Red colour" ), YELLOW( "Yellow colour" ), DEFAULT( "Default colour" ),
        WHITE( "White colour" ), GREEN( "Green colour" ), PURPLE( "Purple colour" ), ORANGE( "Orange colour" );
        
        private String color;
        
        Colour( String color ) {
            this.color = color;
        }
        
        public String getColor() {
            return color;
        }
        
        public void setColor( Colour colour ) {
            this.color = colour.name();
        }
    }
    
    Circle() {
        this.radius = DEFAULT_RADIUS;
        this.colour = Colour.DEFAULT;
    }
    
    Circle( double radius ) {
        this.radius = radius;
        this.colour = Colour.DEFAULT;
    }
    
    Circle( double radius, Colour colour ) {
        this.radius = radius;
        this.colour = colour;
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
        this.colour.color = colour.color;
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
        return String.format( "\nThe radius of circle is : %.1f " +
                        "\nThe colour of circle is : %s" +
                        "\nThe area of circle is : %.1f\n",
                this.getRadius(),
                this.getColour().getColor(),
                this.getArea() );
    }
}
