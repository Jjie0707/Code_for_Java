package test3;

public class Lesson {
    public String lesson;

    public Lesson() {
    }

    public Lesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lesson='" + lesson + '\'' +
                '}';
    }
}
