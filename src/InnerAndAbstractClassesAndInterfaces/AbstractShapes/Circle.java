package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

class Circle extends Shape {

    private static final double DEFAULT_RADIUS =1.0;
    private static final int DEFAULT_X = 1;
    private static final int DEFAULT_Y = 1;
    private double radius;
    private double x_coordinate;
    private double y_coordinate;

    protected Circle() {
        this.radius = DEFAULT_RADIUS;
        this.x_coordinate = DEFAULT_X;
        this.y_coordinate = DEFAULT_Y;
    }

    protected Circle(double radius) {
        this.radius = radius;
        this.x_coordinate = DEFAULT_X;
        this.y_coordinate = DEFAULT_Y;
    }

    private double getRadius() {
        return this.radius;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return (Math.PI * (Math.pow(this.getRadius(), 2)));
    }

    @Override
    double getPerimeter() {
        return Double.parseDouble("The circle has no perimeter!!!");
    }

    boolean isInside(double x, double y) {
        if ((Math.pow((x - this.x_coordinate), 2) + (Math.pow((y - this.y_coordinate), 2))) <= (Math.pow(this.radius, 2))) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    void printLengthOfCircumference() {
        System.out.printf("The length of circumference is : %.1f"+"\n",(2 * Math.PI * this.radius));
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius = %.1f , which is a subclass of %s"
                , this.getRadius(), super.toString());
    }
}
