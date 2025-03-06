package Test;

public class Dog {
    public String name;
    public String color;

    public void bark(){
        System.out.println(name+"你在狗叫什么！");
    }
    public void makeDog(Dog this,String name,String color){
        this.name=name;
        this.color=color;
    }
}
