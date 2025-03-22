package test;

public class Lesson implements Comparable<Lesson>,Cloneable{
    public String classname;

    public Lesson(String classname) {
        this.classname = classname;
    }

    @Override
    public int compareTo(Lesson o) {
        return this.classname.compareTo(o.classname);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "classname='" + classname + '\'' +
                '}';
    }
}
