package ObjectBasics.OptionalTurtle;

import java.util.Scanner;

public class TurtleGraphicsDemo {

    static void showTitleMenu() {
        System.out.println("\f");
        System.out.println("*********************************************");
        System.out.println("* 1 - Play with turtle.                     *");
        System.out.println("* 2 - Exit.                                 *");
        System.out.println("*********************************************" + "\n");
    }

    public static void main(String[] args) throws Exception {


        Scanner userInput = new Scanner(System.in);
        TurtleGraphics turtle = new TurtleGraphics(20, 20, '.', 'x', 'o');

        while (true) {

            showTitleMenu();

            switch (userInput.nextLine()) {

                case ("1"):

                    turtle.clearBoard();

                    while (true) {

                        try {

                            turtle.showTurtle();
                            turtle.showBoard();


                            System.out.print("\n" + "Choose the direction of movement and the number of steps: " + "\n"
                                    + "\n" + "For example: r 5 - to go 5 steps to the right." + "\n"
                                    + "c - to clean a board and start again." + "\n");

                            String directionAndNumberSteps = userInput.nextLine();
                            char[] dire = directionAndNumberSteps.toCharArray();
                            int numberOfSteps = 0;
                            String direction;

                            if (dire.length == 1) {
                                direction = String.valueOf(dire[0]);
                            } else {
                                direction = String.valueOf(dire[0]);
                                numberOfSteps = Integer.parseInt(String.valueOf(dire[2]));
                            }


                            switch (TurtleGraphics.Direction.valueOf(direction)) {

                                case u:

                                    for (int i = 0; i < numberOfSteps; i++) {
                                        turtle.turtleColor();
                                        turtle.moveTurtle(TurtleGraphics.Direction.u);
                                        turtle.gameOver();
                                    }

                                    break;

                                case d:

                                    for (int i = 0; i < numberOfSteps; i++) {
                                        turtle.turtleColor();
                                        turtle.moveTurtle(TurtleGraphics.Direction.d);
                                        turtle.gameOver();
                                    }

                                    break;

                                case l:

                                    for (int i = 0; i < numberOfSteps; i++) {
                                        turtle.turtleColor();
                                        turtle.moveTurtle(TurtleGraphics.Direction.l);
                                        turtle.gameOver();
                                    }

                                    break;

                                case r:

                                    for (int i = 0; i < numberOfSteps; i++) {
                                        turtle.turtleColor();
                                        turtle.moveTurtle(TurtleGraphics.Direction.r);
                                        turtle.gameOver();
                                    }

                                    break;

                                case c:

                                    turtle.moveTurtle(TurtleGraphics.Direction.c);

                                    break;
                            }

                        } catch (Exception e) {
                            e.getMessage();
                            System.err.println("Incorrect input ...Please try again...");
                        }
                    }

                case ("2"): //Exit

                    System.err.print("\n" + "Exiting...");
                    System.exit(0);
                    break;

                default:

                    System.err.print("Incorrect input...please, press any key to continue...");
                    System.in.read();
            }
        }
    }
}
