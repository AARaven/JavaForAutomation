package ObjectBasics.OptionalTurtle;

import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        TurtleGraphics turtle = new TurtleGraphics();

        turtle.clearBoard();

        while (true) {

            turtle.showTurtle();
            turtle.showBoard();


            switch (TurtleGraphics.Direction.valueOf(userInput.nextLine())) {

                case u:

                    turtle.moveTurtle(TurtleGraphics.Direction.u);
                    break;

                case d:
                    turtle.moveTurtle(TurtleGraphics.Direction.d);
                    break;

                case l:
                    turtle.moveTurtle(TurtleGraphics.Direction.l);
                    break;
                case r:
                    turtle.moveTurtle(TurtleGraphics.Direction.r);
                    break;
            }
        }
    }
}
