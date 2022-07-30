package by.devincubator.task15;

public interface Converter<T, N> {
    N convert(T t);

    static <T> boolean isNotNull(T t) {
        return t != null;
    }

    default void writeToConsole(T t) {
        System.out.println(t.toString());
    }
}
