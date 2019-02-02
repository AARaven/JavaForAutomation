package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

import java.util.Objects;

class Rectangle extends Shape {

    protected double width;
    protected double length;

    protected static final double DEFAULT_WIDTH = 1.0;
    protected static final double DEFAULT_LENGTH = 1.0;

    protected Rectangle() {
        this.width = DEFAULT_WIDTH;
        this.length = DEFAULT_LENGTH;
    }

    protected Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    private double getWidth() {
        return this.width;
    }

    private double getLength() {
        return this.length;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setLength(double length) {
        this.length = length;
    }

    protected double getPerimeter() {
        return (2 * (this.getLength() + this.getWidth()));
    }

    protected double getArea() {
        return (this.length * this.width);
    }

    protected boolean isInside(double x, double y) {
        return x < this.width && y < this.length;
    }

    void printLengthOfCircumference() {
        System.out.println("The rectangle has no circumference !!! \n");
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width = %.1f and length = %.1f , which a subclass of %s"
                , this.width, this.length, super.toString());
    }
    
    @Override
    public boolean equals( Object obj ) {
        
        if ( this == obj ) {
            return true;
        }
    
        if ( !( obj instanceof Rectangle ) ) {
            return false;
        }
    
        Rectangle rectangle = ( Rectangle ) obj;
        return this.length == rectangle.length
                && this.width == rectangle.width;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.length, this.width );
    }
}
