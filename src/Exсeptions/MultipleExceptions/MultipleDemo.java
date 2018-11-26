package Exсeptions.MultipleExceptions;

public class MultipleDemo {

    static void throwFirst() throws FirstException {
        throw new FirstException("first");
    }

    static void throwSecond() throws SecondException {
        throw new SecondException("second");
    }

    static void throwThird() throws ThirdException {
        throw new ThirdException("third");
    }

    static void throwAll() throws FirstException,SecondException,ThirdException {
        throwFirst();
        throwSecond();
        throwThird();
    }

//    static void throwMultipleExClass() throws MultipleException {
//        throw new MultipleException(new FirstException("first"),new SecondException("second"),new ThirdException("third"));
//    }

    public static void main(String[] args) {

        try {

            int[] array = new int[10];
            for (int i : array) System.out.print(String.format("{ %d }" + " ", i));

            throwAll();

        } catch (FirstException | SecondException | ThirdException ex) {
            System.out.println("\n" + "Exception : " + ex);
        }

//        try {
//             throwMultipleExClass();
//        } catch (MultipleException e) {
//            e.printStackTrace();
//            e.e1.printStackTrace();
//            e.e2.printStackTrace();
//            e.e3.printStackTrace();
//            System.out.println(e);
//        }
    }
}

