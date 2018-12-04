package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

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
        System.out.printf("The rectangle has no circumference !!! " + "\n");
    }

    @Override
    public String toString() {
        return String.format("A Rectangle with width = %.1f and length = %.1f , which a subclass of %s"
                , this.width, this.length, super.toString());
    }
}
