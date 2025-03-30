package test;

public class Person2 {
    private static Person2 person;

    private Person2() {
    }

    public static Person2 getPerson2(){
        if(person==null){
            person=new Person2();
        }
        return person;
    }
}
