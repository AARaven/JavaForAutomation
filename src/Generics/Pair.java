package Generics;

import javafx.scene.shape.Circle;

public class Pair<T1,T2>  {

    private T1 t1;
    private T2 t2;

    private T1 getFirst() {
        return t1;
    }

    private T2 getSecond() {
        return t2;
    }

    private Pair(T1 t1, T2 t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    public static void main(String[] args) {

        Pair <Circle,String> pair = new Pair <>(new Circle(),"simple Circle");

        String name = pair.getSecond();
        Circle circle = pair.getFirst();

        System.out.println(circle);
        System.out.println(name);
    }
}
