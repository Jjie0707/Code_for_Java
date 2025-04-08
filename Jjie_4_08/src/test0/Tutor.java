package test0;

public class Tutor extends Teacher{
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("助教正在批改作业....");
    }
}
