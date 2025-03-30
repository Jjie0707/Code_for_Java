package test;

public class Person1 {
    private static Person1 person=new Person1();

    private Person1() {
    }

    public static Person1 getPerson1(){
        return Person1.person;
    }

}
