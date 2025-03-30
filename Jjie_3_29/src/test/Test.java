package test;

public class Test {
    public static void main(String[] args) {
        //测试单例模式的饿汉式
        Person1 p1=Person1.getPerson1();
        Person1 p2=Person1.getPerson1();

        System.out.println(p1==p2);

        Person2 p3=Person2.getPerson2();
        Person2 p4=Person2.getPerson2();

        System.out.println(p3==p4);
    }
}
