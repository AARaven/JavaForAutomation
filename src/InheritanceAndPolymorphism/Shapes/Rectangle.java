package InheritanceAndPolymorphism.Shapes;

class Rectangle extends Shape {

    protected double width;
    protected double length;

    protected static final double DEFAULT_WIDTH = 1.0;
    protected static final double DEFAULT_LENGTH = 1.0;

    protected Rectangle() {
        this.width = DEFAULT_WIDTH;
        this.length = DEFAULT_LENGTH;
        this.colour = DEFAULT_COLOUR;
        this.filled = DEFAULT_FILLED;
    }

    protected Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        this.colour = DEFAULT_COLOUR;
        this.filled = DEFAULT_FILLED;
    }

    protected Rectangle(double width, double length, String colour, boolean filled) {
        this.width = width;
        this.length = length;
        this.colour = colour;
        this.filled = filled;
    }

    private double getWidth() {
        return this.width;
    }

    private double getLength() {
        return this.length;
    }

    private String getColour() {
        return this.colour;
    }

    private boolean isFilled() {
        return this.filled;
    }

    private void setWidth(double width) {
        this.width = width;
    }

    private void setLength(double length) {
        this.length = length;
    }

    private void setColour(String colour) {
        this.colour = colour;
    }

    private void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected double getPerimeter() {
        return (2 * (this.getLength() + this.getWidth()));
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width = %.1f and length = %.1f , which a subclass of %s"
                , this.width, this.length, super.toString());
    }
}
