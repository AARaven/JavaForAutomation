package Exсeptions.ExceptionsHierarchy;

public class MiddleLevelEx extends BaseLevelEx {

    String message;

    MiddleLevelEx() {
        this.message = "{MiddleLevelException} [default exception constructor]";
    }

    MiddleLevelEx(String message) {
        this.message = message;
    }

    @Override
    public void throwEx() throws MiddleLevelEx {
        throw new MiddleLevelEx("Middle exception from throwEx method.");
    }
}
