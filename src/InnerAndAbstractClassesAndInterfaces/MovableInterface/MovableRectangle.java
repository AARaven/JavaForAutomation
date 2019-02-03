package InnerAndAbstractClassesAndInterfaces.MovableInterface;

import java.util.Objects;

public class MovableRectangle implements Movable {
    
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    
    private MovablePoint getTopLeft() {
        return this.topLeft;
    }
    
    private MovablePoint getBottomRight() {
        return this.bottomRight;
    }
    
    private void setTopLeft( MovablePoint topLeft ) {
        this.topLeft = topLeft;
    }
    
    private void setBottomRight( MovablePoint bottomRight ) {
        this.bottomRight = bottomRight;
    }
    
    private int getTopX() {
        return topLeft.getX();
    }
    
    private int getTopY() {
        return topLeft.getY();
    }
    
    private int getBottomX() {
        return bottomRight.getX();
    }
    
    private int getBottomY() {
        return bottomRight.getY();
    }
    
    MovableRectangle( MovablePoint topLeft, MovablePoint bottomRight ) {
        this.setTopLeft( topLeft );
        this.setBottomRight( bottomRight );
    }
    
    @Override
    public void moveUp() {
        this.getTopLeft().setY( this.getTopLeft().getY() + this.getTopLeft().getYSpeed() );
        this.getBottomRight().setY( this.getBottomRight().getY() + this.getBottomRight().getYSpeed() );
        System.out.printf("\nMove up : \n%s",this);
    }
    
    @Override
    public void moveDown() {
        this.getTopLeft().setY( this.getTopLeft().getY() - this.getTopLeft().getYSpeed() );
        this.getBottomRight().setY( this.getBottomRight().getY() - this.getBottomRight().getYSpeed() );
        System.out.printf("\nMove down : \n%s",this);
    }
    
    @Override
    public void moveLeft() {
        this.getTopLeft().setX( this.getTopLeft().getX() - this.getTopLeft().getXSpeed() );
        this.getBottomRight().setX( this.getBottomRight().getX() - this.getBottomRight().getXSpeed() );
        System.out.printf("\nMove left : \n%s",this);
    }
    
    @Override
    public void moveRight() {
        this.getTopLeft().setX( this.getTopLeft().getX() + this.getTopLeft().getXSpeed() );
        this.getBottomRight().setX( this.getBottomRight().getX() + this.getBottomRight().getXSpeed() );
        System.out.printf("\nMove right : \n%s",this);
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof MovableRectangle ) ) {
            return false;
        }
        
        MovableRectangle rectangle = ( MovableRectangle ) object;
        return this.getTopLeft().equals( rectangle.getTopLeft() )
                && this.getBottomRight().equals( rectangle.getBottomRight() );
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getTopLeft(),
                this.getBottomRight() );
    }
    
    @Override
    public String toString() {
        return String.format( "Left topside { %d | %d } \nBottom side { %d | %d }.\n",
                this.getTopLeft().getX(),
                this.getTopLeft().getY(),
                this.getBottomRight().getX(),
                this.getBottomRight().getY() );
    }
}
