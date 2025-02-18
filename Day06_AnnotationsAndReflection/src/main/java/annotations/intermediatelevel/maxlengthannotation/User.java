package annotations.intermediatelevel.maxlengthannotation;

import java.lang.reflect.Field;

public class User {
    @MaxLength(10)
    private String username;

    public User(String username) {
        if(username.length() > getMaxLength("username")) {
            throw new IllegalArgumentException("Username exceeds maximum allowed length");
        }
        this.username = username;
    }

    private int getMaxLength(String fieldName) {
        try {
            Field field = this.getClass().getDeclaredField(fieldName);
            MaxLength maxLength = field.getAnnotation(MaxLength.class);
            return (maxLength != null) ? maxLength.value() : Integer.MAX_VALUE;
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return Integer.MAX_VALUE;
        }
    }
}
