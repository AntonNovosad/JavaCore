package by.devincubator.task18;

public class ObjectFactory {
    static <T> T create(Class<T> clazz) {
        T myClass = null;
        try {
            myClass = clazz.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return myClass;
    }
}
