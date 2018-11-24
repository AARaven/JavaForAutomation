package Generics;

public class GenericMethod {

    private static <T extends Comparable> boolean compareIt(T t1, T t2) {
        return t1.compareTo(t2) == 0;
    }

    public static void main(String[] args) {

        String a = "A";
        String b = "B";
        String c = "B";
        String d = "A";

        Character character = 'f';
        Character character2 = 'd';
        Character character3 = 'f';
        Character character4 = 'g';

        int eax = 25;
        int ebx = 13;
        int ecx = 25;
        int edx = 24;

        System.out.println();
        System.out.println(compareIt(a, b));
        System.out.println(compareIt(b, c));
        System.out.println(compareIt(a, c));
        System.out.println(compareIt(a, d));
        System.out.println();

        System.out.println(compareIt(character, character2));
        System.out.println(compareIt(character2, character3));
        System.out.println(compareIt(character3, character));
        System.out.println(compareIt(character, character4));
        System.out.println();

        System.out.println(compareIt(eax, ebx));
        System.out.println(compareIt(ecx, eax));
        System.out.println(compareIt(edx, eax));
        System.out.println(compareIt(ebx, edx));
    }
}
