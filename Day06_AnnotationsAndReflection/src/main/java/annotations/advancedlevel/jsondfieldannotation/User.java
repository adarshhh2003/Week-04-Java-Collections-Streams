package annotations.advancedlevel.jsondfieldannotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class User {
    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String toJson() {
        StringBuilder json = new StringBuilder("{");
        Field[] fields = this.getClass().getDeclaredFields();
        List<String> jsonFields = new ArrayList<>();

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                try {
                    String key = field.getAnnotation(JsonField.class).name();
                    Object value = field.get(this);
                    jsonFields.add("\"" + key + "\": \"" + value + "\"");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        json.append(String.join(", ", jsonFields)).append("}");
        return json.toString();
    }
}