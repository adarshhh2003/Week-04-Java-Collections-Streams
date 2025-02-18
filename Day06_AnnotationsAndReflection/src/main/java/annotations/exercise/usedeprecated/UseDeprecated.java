package annotations.exercise.usedeprecated;

public class UseDeprecated {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        // Show a warning
        api.oldFeature();

        // Calling the new method
        api.newFeature();
    }
}
