package by.devincubator.task17;

import java.lang.annotation.Native;

@Deprecated
public class MyClass implements MyInterface {
    private static final String NAME = "name";
    @Native
    @Deprecated
    private int age;
    @Deprecated
    private String phone;

    public MyClass(int age, String phone) {
        this.age = age;
        this.phone = phone;
    }

    public MyClass() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void methodOne(int age) {
    }

    @Override
    public String methodTwo(String phone) {
        return null;
    }
}
