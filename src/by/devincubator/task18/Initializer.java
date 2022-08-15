package by.devincubator.task18;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Initializer {
    static <T> T initializer(T target, String fieldName, Object value) {
        String nameSetMethod = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        try {
            Method setter = target.getClass().getMethod(nameSetMethod, value.getClass());
            setter.invoke(target, value);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return target;
    }
}
