package test;

public class Student extends People {
//    public static String name="Jjie";
//    public int age;
//    {
//        System.out.println("执行了");
//        this.age=18;
//    }
//    static{
//        System.out.println("执行了静态代码块");
//        name="Lu_";
//    }
    public void method(){
        System.out.println("nothing");
        super.method();
    }
    public void sleep(){
        System.out.println(this.name+"在睡觉");
    }
}
