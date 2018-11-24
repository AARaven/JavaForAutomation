package JavaFundamentals;

import java.util.Scanner;

/*---------------------------------------------------  
    Java Fundamentals Practice #1 : Find the minimum
    Create the following methods:
---------------------------------------------------------------------------------------------------
--> The method that takes 2 integer arguments and returns the lowest;
--> The method that takes 3 integer arguments and returns the lowest ( using the first method);
--> The method that takes 4 integer arguments and returns the lowest ( using previous method);
--------------------------------------------------------------------------------------------------*/

public class FindTheMinimum {

    int firstVal = 0;
    int secondVal = 0;
    int thirdVal = 0;
    int fourthVal = 0;

    public int equalizerLowerOfTwo(int first, int second) {

        firstVal = first;
        secondVal = second;

        int result;

            if (firstVal < secondVal) {
                result = firstVal;
                return result;
            } else if (firstVal > secondVal) {
                result = secondVal;
                return result;
            } else {
                result = firstVal;
                return result;
            }
    }


    public int equalizerLowerOfTree(int first, int second, int third) {

        firstVal = first;
        secondVal = second;
        thirdVal = third;

        int result;

            if (equalizerLowerOfTwo(firstVal,secondVal) < thirdVal) {
                result = equalizerLowerOfTwo(firstVal,secondVal);
                return result;
            } else if (equalizerLowerOfTwo(firstVal,secondVal) > thirdVal) {
                result = thirdVal;
                return result;
            } else {
                result = thirdVal;
                return result;
            }
    }


    public int equalizerLowerOfFour(int first, int second, int third, int fourth) {

        firstVal = first;
        secondVal = second;
        thirdVal = third;
        fourthVal = fourth;

        int result;

            if (equalizerLowerOfTree(firstVal, secondVal, thirdVal) < fourthVal) {
                result = equalizerLowerOfTree(firstVal, secondVal, thirdVal);
                return result;
            } else if (equalizerLowerOfTree(firstVal, secondVal, thirdVal) > fourthVal) {
                result = fourthVal;
                return result;
            } else {
                result = fourthVal;
                return result;
            }
    }

        public static void main (String[]args) throws Exception {

            int a,b,c,d;

            FindTheMinimum task = new FindTheMinimum();
            Scanner userInput = new Scanner(System.in);

            while (true) {

                System.out.println("*******************************************");
                System.out.println("* 1 - To find the lower of two values.    *");
                System.out.println("* 2 - To find the lower of three values.  *");
                System.out.println("* 3 - To find the lower of four values.   *");
                System.out.println("* 4 - Exit.                               *");
                System.out.println("*******************************************");
                System.out.println();

                int checkUserInput = userInput.nextInt();

                switch (checkUserInput) {

                    case 1:

                        System.out.println();
                        System.out.println("Enter the 2 values : ");
                        a = userInput.nextInt();
                        b = userInput.nextInt();
                        System.out.println();
                        System.out.print("The lower is : ");
                        System.out.println(task.equalizerLowerOfTwo(a,b));
                        System.out.println();
                        System.out.println("Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 2:

                        System.out.println();
                        System.out.println("Enter the 3 values : ");
                        a = userInput.nextInt();
                        b = userInput.nextInt();
                        c = userInput.nextInt();
                        System.out.println();
                        System.out.print("The lower is : ");
                        System.out.println(task.equalizerLowerOfTree(a, b, c));
                        System.out.println();
                        System.out.println("Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 3:

                        System.out.println();
                        System.out.println("Enter the 4 values : ");
                        a = userInput.nextInt();
                        b = userInput.nextInt();
                        c = userInput.nextInt();
                        d = userInput.nextInt();
                        System.out.println();
                        System.out.print("The lower is : ");
                        System.out.println(task.equalizerLowerOfFour(a, b, c, d));
                        System.out.println();
                        System.out.println("Press 'ENTER' for continue...");
                        System.in.read();
                        break;

                    case 4:

                        System.out.println("Exiting...");
                        System.exit(0);

                    default:

                        System.out.println();
                        System.out.println("Incorrect values...");
                        System.out.println();
                        break;
                }
            }
        }
    }