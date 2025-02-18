package annotations.exercise.usedeprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("This is a old feature. It should not be used.");
    }

    public void newFeature() {
        System.out.println("This is a new feature. Use this instead.");
    }
}
