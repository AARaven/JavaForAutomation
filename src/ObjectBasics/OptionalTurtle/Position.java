package ObjectBasics.OptionalTurtle;

public class Position {

    protected final int XDEFAULT_POSITION = 0;
    protected final int YDEFAULT_POSITION = 0;

    private int x_position;
    private int y_position;

    public int getX_position() {
        return x_position;
    }

    public int getY_position() {
        return y_position;
    }

    public void setX_position(int x_position) {
        this.x_position = x_position;
    }

    public void setY_position(int y_position) {
        this.y_position = y_position;
    }

    Position() {
        this.x_position = XDEFAULT_POSITION;
        this.y_position = YDEFAULT_POSITION;
    }

}
