package test0;

public class Lecturer extends Teacher{
    public Lecturer() {
    }

    public Lecturer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("老师正在讲课.....");
    }

}
