package annotations.exercise.supresswarnings;

import java.util.ArrayList;

public class LegacyList {
    @SuppressWarnings("unchecked")
    public void useRawList() {
        ArrayList rawList = new ArrayList();
        rawList.add("Item 1");
        rawList.add("Item 2");
        rawList.add("Item 3");

        System.out.println("Raw list items: " + rawList);
    }
}
