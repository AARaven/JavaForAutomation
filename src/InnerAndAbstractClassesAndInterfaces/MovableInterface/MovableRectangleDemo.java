package InnerAndAbstractClassesAndInterfaces.MovableInterface;

public class MovableRectangleDemo {
    
    public static void main( String[] args ) {
        
        MovablePoint pointB = new MovablePoint( 1, 2 );
        MovablePoint pointD = new MovablePoint( 1, 4 );
        MovableRectangle movableRect = new MovableRectangle( pointB, pointD );
        
        System.out.println( movableRect);
        
        movableRect.moveDown();
        movableRect.moveUp();
        movableRect.moveLeft();
        movableRect.moveLeft();
        movableRect.moveDown();
        movableRect.moveRight();
        movableRect.moveUp();
    }
}
