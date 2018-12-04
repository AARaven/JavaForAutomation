package Exсeptions.ExceptionsHierarchy;

public class MainMethod {

    public static void main(String[] args) {

        LowLevelEx lower = new LowLevelEx();

        try {
            ((BaseLevelEx) lower).throwEx();
        } catch (BaseLevelEx baseLevelEx) {
            baseLevelEx.printStackTrace();
        }
    }
}
