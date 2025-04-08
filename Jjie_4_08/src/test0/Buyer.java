package test0;

public class Buyer extends AdminStaff{
    public Buyer() {
    }

    @Override
    public void work() {
        super.work();
        System.out.println("购货员正在采购.....");
    }

    public Buyer(String id, String name) {
        super(id, name);
    }
}
