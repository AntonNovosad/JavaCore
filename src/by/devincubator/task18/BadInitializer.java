package by.devincubator.task18;

import java.lang.reflect.Field;

public class BadInitializer extends Initializer {
    static <T> T initializer(T target, String fieldName, Object value) {
        try {
            Field field = target.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(target, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return target;
    }
}
