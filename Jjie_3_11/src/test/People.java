package test;

public class People {
    public String name;
    public int age;

    public void eat(){
        System.out.println(this.name+"在吃饭");
    }
    public void method(){
        System.out.println("我叫"+this.name);
        System.out.println("我今年"+this.age);
    }
}
