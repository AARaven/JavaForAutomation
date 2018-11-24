package InheritanceAndPolymorphism.MathUtil;

import java.util.Random;

public class MathUtilDemo {

    public static void main(String[] args) {

        Random random = new Random(1);

        int[] integers = new int[10];
        for (int i = 0; i < integers.length; i++) integers[i] = random.nextInt(100);

        double[] doubles = new double[10];
        for (int i = 0; i < doubles.length; i++) doubles[i] = random.nextDouble();

        System.out.print("\n"+"The random integers array : "+"\n");
        System.out.print("___________________________________________________"+"\n");

            for (int i : integers) System.out.printf("The value in element integer array is : %1d." + "\n", i);

        System.out.print("\n"+"The random doubles array : "+"\n");
        System.out.print("___________________________________________________"+"\n");

            for (double i : doubles) System.out.printf("The value in element double array is : %f." + "\n", i);

        System.out.print("___________________________________________________"+"\n");
        System.out.printf("The min value in integer array is : %d."+"\n",MathUtil.minAtArray(integers));
        System.out.printf("The max value in integer array is : %d."+"\n",MathUtil.maxAtArray(integers));
        System.out.printf("The min value in double array is : %.3f."+"\n",MathUtil.minAtArray(doubles));
        System.out.printf("The max value in double array is : %.3f."+"\n",MathUtil.maxAtArray(doubles));

        System.out.print("___________________________________________________"+"\n");
        System.out.print("\n");
        System.out.print("The method nextAfterArray of integers"+"\n"+".......result is : ");
        System.out.print(MathUtil.nextAfterAtArray(integers,54)+"\n\n");
        System.out.print("The method nextAfterArray of doubles (predefined) "+"\n"+".......result is : ");
        System.out.print("\n\n");
        System.out.print("The method nextAfterArray of doubles"+"\n"+".......result is : ");
        System.out.print(MathUtil.nextAfterAtArray(doubles,0.939865)+"\n\n");
        System.out.print("The method powBetween of integers"+"\n"+".......result is : ");
        System.out.print(MathUtil.powBetween(2,12)+"\n\n");
        System.out.print("The method powBetween of doubles"+"\n"+".......result is : ");
        System.out.print(MathUtil.powBetween(9.0, 3.25)+"\n");
    }
}
