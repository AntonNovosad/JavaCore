package by.devincubator.task2;

import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;

public class Task2Loader {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        URL[] urls = new URL[]{new URL("file:///c:/Users/User/IdeaProjects/JavaCore/out/example.jar")};
        URLClassLoader classLoader = new URLClassLoader(urls);
        Class<?> aClass = classLoader.loadClass("by.devincubator.task2.Task2");

        try {
            Task2 instance = (Task2) aClass.newInstance();
            instance.main(new String[]{});
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
