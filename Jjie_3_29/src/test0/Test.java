package test0;

//测试工厂模式
public class Test {
    public static void main(String[] args){
        AdminFactory adminFactory = new AdminFactory();
        UserFactory userFactory = new UserFactory();

        Admin admin1 = adminFactory.buildAdmin("刘备", "1001");

        User s1 = userFactory.buildUser("张飞", "1002");
        User s2 = userFactory.buildUser("关羽", "1003");
        System.out.println(admin1.toString());
    }
}