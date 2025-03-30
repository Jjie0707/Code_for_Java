package test1;

public class Test {
    public static void main(String[] args) {
        AdminUser admin=new AdminUser("刘备","1001");

        NomalUser s1=new NomalUser("张飞","1002");

        ProxyUser p1=new ProxyUser(admin);
        ProxyUser p2=new ProxyUser(s1);

        p1.addBook("《水浒传》");
        p1.borrowBook("《神雕侠侣》");

        p2.addBook("《西游记》");
        p2.borrowBook("《西游记》");
    }
    //练习下代理模式
}
