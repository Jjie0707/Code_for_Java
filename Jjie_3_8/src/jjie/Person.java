package jjie;

public class Person {
    public String name;
    public int age;

    public Person(){
        this("Jjie",18);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println(this.name +"吃饭");
    }
    public void sleep(){
        System.out.println(this.name+"睡觉");
    }
    public void activity(){
        this.eat();
        this.sleep();
    }
}
