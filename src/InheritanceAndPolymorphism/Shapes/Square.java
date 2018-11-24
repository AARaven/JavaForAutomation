package InheritanceAndPolymorphism.Shapes;

class Square extends Rectangle{

    protected Square() {
        this.width = DEFAULT_WIDTH;
        this.length = DEFAULT_LENGTH;
    }

    private Square(double side) {
        this.width = side;
        this.length = side;
        this.colour = DEFAULT_COLOUR;
        this.filled = DEFAULT_FILLED;
    }

    private Square(double side, String colour, boolean filled) {
        this.width = side;
        this.length = side;
        this.colour = colour;
        this.filled = filled;
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
    public String toString() {
        return String.format("A Square with side = %.1f , which is a subclass of %s"
                , this.length, super.toString());
    }
}
