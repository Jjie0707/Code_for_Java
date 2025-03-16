package test;

public class Person{

    protected String name = "Person";

    int age=0;

}

class Child extends Person{

    public String grade;
    public void func(){
        System.out.println(super.name);
    }
    public static void main0(String[] args){

        Person p = new Child();
        Child c=new Child();
        c.func();
        System.out.println(p.name);

    }

}
