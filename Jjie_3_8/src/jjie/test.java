package jjie;

public class test {
    public static void main4(String[] args) {
        Person p=new Person();
        p.activity();
    }

    public static void main3(String[] args) {
        int[][] arr=null;
        System.out.println(arr);
    }
    private int count;

//    test(int a) {
//        count = a;
//    }
//    public static void main2(String[] args) {
//        test test = new test(88);
//        System.out.println(test.count);
//    }


    public static void main1(String[] args) {
        Person p=new Person("Lu_",18);
        p.activity();
        p.sleep();
    }

    public class Person1{
        public String name;
        public int age;

        public Person1(String name,int age){
            this.name=name;
            this.age=age;
        }
        public void eat(){
            System.out.println(this.name+"在吃饭");
        }
    }
    //非静态类不能直接在静态方法中调用
    //可以直接将非静态的内部类独立出去
    //也可以先创建一个实例
    public static void main0(String[] args) {
        test test1=new test();
        Person1 p1 = test1.new Person1("Jjie", 18);
//        静态类才能这样使用
//        Person1 p2=new Person("Lu_",16);
        p1.eat();
    }
}
