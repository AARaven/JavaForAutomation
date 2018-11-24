package InnerAndAbstractClassesAndInterfaces.MovableInterface;

public class MovablePoint implements MovableInterface {

    private static final int DEFAULT_X_SPEED = 1;
    private static final int DEFAULT_Y_SPEED = 1;

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    protected MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
        this.xSpeed = DEFAULT_X_SPEED;
        this.ySpeed = DEFAULT_Y_SPEED;
    }

    protected MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    protected int getX() {
        return x;
    }

    protected int getY() {
        return y;
    }

    protected int getxSpeed() {
        return xSpeed;
    }

    protected int getySpeed() {
        return ySpeed;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    protected void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return String.format("The point x with coordinates : %d and point y with coordinates : %d .",x,y);
    }

    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }
}
