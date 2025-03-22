package test;

public class Student implements Comparable<Student>,Cloneable {
    public String name;
    public int age;
    public int score;
    public Lesson lesson;

    public Student() {
    }

    public Student(String name, int age, int score, Lesson lesson) {
        this.name = name;
        this.age = age;
        this.score = score;
        this.lesson = lesson;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student tem=(Student)super.clone();
        Lesson tem1=(Lesson)this.lesson.clone();
        tem.lesson=tem1;
        return tem;
    }

    @Override
    public int compareTo(Student o) {
        return this.lesson.compareTo(o.lesson);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", lesson=" + lesson +
                '}';
    }
}
