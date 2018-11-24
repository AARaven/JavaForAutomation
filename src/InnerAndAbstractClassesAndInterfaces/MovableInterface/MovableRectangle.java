package InnerAndAbstractClassesAndInterfaces.MovableInterface;

public class MovableRectangle implements MovableInterface {

    protected MovablePoint topLeft;
    protected MovablePoint bottomRight;

    MovableRectangle(/*MovablePoint A, */MovablePoint b,/* MovablePoint C,*/ MovablePoint d) {
        this.topLeft = b;
        this.bottomRight = d;
    }

    public int getTopX() {
        return topLeft.getX();
    }

    public int getTopY() {
        return topLeft.getY();
    }

    public int getBottomX() {
        return bottomRight.getX();
    }

    public int getBottomY() {
        return bottomRight.getY();
    }

    @Override
    public String toString() {
     return String.format("This rect left topside is: x: %d and y: %d and bottom side is - x: %d and  y: %d."
             ,this.topLeft.getX(),this.topLeft.getY(),this.bottomRight.getX(),this.bottomRight.getY());
    }

    @Override
    public void moveUp() {
        System.out.println("\n"+"the rect is moveUp:"+"\n");
        this.topLeft.setY(this.topLeft.getY() + this.topLeft.getySpeed());
        this.bottomRight.setY(this.bottomRight.getY() + this.bottomRight.getySpeed());
    }

    @Override
    public void moveDown() {
        System.out.println("\n"+"the rect is moveDown:"+"\n");
        this.topLeft.setY(this.topLeft.getY() - this.topLeft.getySpeed());
        this.bottomRight.setY(this.bottomRight.getY() - this.bottomRight.getySpeed());
    }

    @Override
    public void moveLeft() {
        System.out.println("\n"+"the rect is moveLeft:"+"\n");
        this.topLeft.setX(this.topLeft.getX() - this.topLeft.getxSpeed());
        this.bottomRight.setX(this.bottomRight.getX() - this.bottomRight.getxSpeed());
    }

    @Override
    public void moveRight() {
        System.out.println("\n"+"the rect is moveRight:"+"\n");
        this.topLeft.setX(this.topLeft.getX() + this.topLeft.getxSpeed());
        this.bottomRight.setX(this.bottomRight.getX() + this.bottomRight.getxSpeed());
    }
}
