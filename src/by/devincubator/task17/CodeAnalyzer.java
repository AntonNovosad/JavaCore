package by.devincubator.task17;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class CodeAnalyzer {
    private static final String TAB = "\t";
    private static final String TAB_TAB = "\t\t";
    private static final String EMPTY_STRING = "";
    private static final String MODIFIERS = "Modifiers: ";
    private static final String ANNOTATIONS = "Annotations: ";
    private static final String NAME = "Name: ";
    private static final String TYPE = "Type: ";

    public static void analyzeClass(Object o) {
        showClassName(o);
        printLine();
        showClassLoader(o);
        printLine();
        showInterfaces(o);
        printLine();
        showSuperClasses(o);
        printLine();
        showClass(o);
        printLine();
        showConstructors(o);
        printLine();
        showMethods(o);
        printLine();
        showAnnotations(EMPTY_STRING, o.getClass());
    }

    private static void showClassName(Object o) {
        System.out.println("Class name: " + o.getClass().getName());
    }

    private static void showClassLoader(Object o) {
        System.out.println("Class loader: " + o.getClass().getClassLoader());
    }

    private static void showInterfaces(Object o) {
        Class<?>[] list = o.getClass().getInterfaces();
        System.out.println("Interfaces: ");
        for (Class<?> c : list) {
            System.out.println(TAB + "Interface " + c.getSimpleName());
            Method[] array = c.getMethods();
            for (Method m : array) {
                infoMethods(m);
            }
        }
    }

    private static void showSuperClasses(Object o) {
        System.out.println("SuperClass: " + o.getClass().getSuperclass());
    }

    private static void showClass(Object o) {
        Class<?> c = o.getClass();
        Field[] fields = c.getDeclaredFields();
        System.out.println("Fields: ");
        for (Field f : fields) {
            infoFields(f);
            System.out.println();
        }
    }

    private static void showConstructors(Object o) {
        Constructor<?>[] array = o.getClass().getDeclaredConstructors();
        System.out.println("Constructions: ");
        for (Constructor<?> c : array) {
            showModifiers(TAB, c.getModifiers());
            System.out.println();
            Parameter[] parameters = c.getParameters();
            for (Parameter p : parameters) {
                infoParameters(p);
                System.out.println();
            }
        }
    }

    private static void showMethods(Object o) {
        Method[] methods = o.getClass().getDeclaredMethods();
        System.out.println("Methods: ");
        for (Method m : methods) {
            infoMethods(m);
            showAnnotations(TAB, m);
            System.out.println();
        }
    }

    private static void infoMethods(Method m) {
        showModifiers(TAB, m.getModifiers());
        System.out.println();
        System.out.println(TAB + "Return Type: " + m.getReturnType());
        System.out.println(TAB + NAME + m.getName());
        Parameter[] parameters = m.getParameters();
        System.out.println(TAB + "List parameters: ");
        for (Parameter p : parameters) {
            infoParameters(p);
        }
        System.out.println();
    }

    private static void infoFields(Field f) {
        showModifiers(TAB, f.getModifiers());
        System.out.println();
        System.out.println(TAB + TYPE + f.getType());
        System.out.println(TAB + NAME + f.getName());
        showAnnotations(TAB, f);
    }

    private static void infoParameters(Parameter p) {
        showModifiers(TAB_TAB, p.getModifiers());
        System.out.println();
        System.out.println(TAB_TAB + TYPE + p.getType());
        showAnnotations(TAB_TAB, p);
    }

    private static void showAnnotations(String str, AnnotatedElement annotatedElement) {
        System.out.print(str + ANNOTATIONS);
        infoAnnotations(annotatedElement);
    }

    private static void infoAnnotations(AnnotatedElement annotatedElement) {
        Annotation[] annotations = annotatedElement.getDeclaredAnnotations();
        for (Annotation a : annotations) {
            System.out.print(a.annotationType().getSimpleName() + " ");
        }
    }

    private static void showModifiers(String str, int modifier) {
        System.out.print(str + MODIFIERS);
        checkModifiers(modifier);
    }

    private static void checkModifiers(int modifier) {
        if (Modifier.isAbstract(modifier)) {
            System.out.print("abstract ");
        }
        if (Modifier.isFinal(modifier)) {
            System.out.print("final ");
        }
        if (Modifier.isInterface(modifier)) {
            System.out.print("interface ");
        }
        if (Modifier.isNative(modifier)) {
            System.out.print("native ");
        }
        if (Modifier.isPrivate(modifier)) {
            System.out.print("private ");
        }
        if (Modifier.isProtected(modifier)) {
            System.out.print("protected ");
        }
        if (Modifier.isPublic(modifier)) {
            System.out.print("public ");
        }
        if (Modifier.isStatic(modifier)) {
            System.out.print("static ");
        }
        if (Modifier.isStrict(modifier)) {
            System.out.print("strict ");
        }
        if (Modifier.isSynchronized(modifier)) {
            System.out.print("synchronized ");
        }
        if (Modifier.isTransient(modifier)) {
            System.out.print("transient ");
        }
        if (Modifier.isVolatile(modifier)) {
            System.out.print("volatile ");
        }
    }

    private static void printLine() {
        System.out.println("-------------------------------------");
    }
}
