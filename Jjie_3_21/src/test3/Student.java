package test3;

public class Student implements Cloneable{
    public String name;
    public int age;
    Lesson lesson;

    public Student() {
    }

    public Student(String name, int age, Lesson lesson) {
        this.name = name;
        this.age = age;
        this.lesson = lesson;
    }
}
