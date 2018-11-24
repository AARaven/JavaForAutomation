package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

class Square extends Rectangle {

    protected Square() {
        this.width = DEFAULT_WIDTH;
        this.length = DEFAULT_LENGTH;
    }

    protected Square(double side) {
        this.width = side;
        this.length = side;
    }

    private Square(double side, String colour, boolean filled) {
        this.width = side;
        this.length = side;
    }

    private void setLength(double side) {
        this.length = side;
        this.width = side;
    }

    private void setWidth(double side) {
        this.width = side;
        this.length = side;
    }

    @Override
    public void printLengthOfCircumference() {
        System.out.printf("The square has no circumference !!! " + "\n");
    }

    @Override
    public String toString() {
        return String.format("A Square with side = %.1f , which is a subclass of %s"
                , this.length, super.toString());
    }
}
