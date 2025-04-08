package test0;

public class Employee {
    private String id;
    private String name;

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee() {
    }

    public void work(){
        System.out.println("员工正在工作...");
    }

}
