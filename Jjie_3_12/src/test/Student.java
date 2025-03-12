package test;
//包含姓名（name）和年龄（age）属性，并添加显示信息的方法display()
public class Student {
    public String name;
    public int age;

    public void display(){
        System.out.println("名字是:"+name);
        System.out.println("年龄是:"+age);
    }
}
