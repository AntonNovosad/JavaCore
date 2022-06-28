package by.devincubator.task1;

public class Task1 {
    public static void main(String[] args) {
        Class<Task1> mainClass = Task1.class;
        System.out.println(mainClass.getClassLoader());
        System.out.println(mainClass.getClassLoader().getParent());
        System.out.println(mainClass.getClassLoader().getParent().getParent());

        System.out.println();
        Class<Integer> integerClass = Integer.class;
        System.out.println(integerClass.getClassLoader());

        System.out.println();
        Class<MyClass> myClass = MyClass.class;
        System.out.println(myClass.getClassLoader());
        System.out.println(myClass.getClassLoader().getParent());
        System.out.println(myClass.getClassLoader().getParent().getParent());
    }
}
