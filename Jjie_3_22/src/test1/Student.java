package test1;

import java.util.Objects;

public class Student {
    public String name;
    public int age;
    public double score;
    public static int a=66 ;
    static{
        System.out.println(888);
    }

    {
        a = 99;
        System.out.println(666);
        System.out.println("被编译器插入到构造方法的前头");
    }

    public Student() {
        a=100;
    }

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(score, student.score) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
