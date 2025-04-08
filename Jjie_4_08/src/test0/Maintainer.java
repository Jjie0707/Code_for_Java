package test0;

public class Maintainer extends AdminStaff{
    public Maintainer() {
    }

    public Maintainer(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println("管理员正在维护秩序...");
    }
}
