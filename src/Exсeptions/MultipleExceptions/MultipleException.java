package Exсeptions.MultipleExceptions;

class MultipleException extends Exception {

    FirstException e1;
    SecondException e2;
    ThirdException e3;

    MultipleException(FirstException e1, SecondException e2, ThirdException e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }
}
