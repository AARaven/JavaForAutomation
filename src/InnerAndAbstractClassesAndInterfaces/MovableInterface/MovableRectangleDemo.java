package InnerAndAbstractClassesAndInterfaces.MovableInterface;

public class MovableRectangleDemo {



    public static void main(String[] args) {

        MovablePoint pointB = new MovablePoint(-1,2);
        MovablePoint pointD = new MovablePoint(1,-2);

        MovableRectangle movableRect = new MovableRectangle(pointB,pointD);

        System.out.print(movableRect);

        movableRect.moveDown();
        System.out.print(movableRect);

        movableRect.moveUp();
        System.out.print(movableRect);

        movableRect.moveLeft();
        System.out.print(movableRect);

        movableRect.moveLeft();
        System.out.print(movableRect);

        movableRect.moveDown();
        System.out.print(movableRect);

        movableRect.moveRight();
        System.out.print(movableRect);

        movableRect.moveUp();
        System.out.print(movableRect);
    }
}
