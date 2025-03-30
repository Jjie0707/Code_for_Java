package test5;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args){
        ArrayList<Student> list = new ArrayList<>();
        flag:while (true) {
            System.out.println("-----学生管理系统-----\n" +
                    "1:增加学生\n"+
                    "2:修改学生\n"+
                    "3:删除学生\n"+
                    "4:查询学生\n"+
                    "5:退出\n"+
                    "请输入您的选择:");
            Scanner sc=new Scanner(System.in);
            String choose=sc.next();
            switch(choose){
                case "1"->addStudent(list);
                case "2"->updateStudent(list);
                case "3"->deleteStudent(list);
                case "4"->showStudent(list);
                case "5"-> {
                    System.out.println("退出系统//");
                    break flag;
                }
                default-> System.out.println("选择错误，请重新选择：");
            }
        }
    }
    public static boolean only(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return false;
            }
        }
        return true;
    }
    public static boolean contains(ArrayList<Student> list,String id){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }
    public static int getIndex(ArrayList<Student> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public static void addStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("请输入id");
        String id=sc.next();
        if(only(list,id)){
            s.setId(id);
            System.out.println("请输入名字");
            s.setName(sc.next());
            System.out.println("请输入地址");
            s.setAddress(sc.next());
            System.out.println("请输入年龄");
            s.setAge(sc.nextInt());
            list.add(s);
        }else{
            System.out.println("ID重复，重新选择.");
        }
    }

    public static void updateStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改的ID：");
        String id=sc.next();
        if(contains(list,id)){
            System.out.println("输入修改之后的名字:");
            list.get(getIndex(list,id)).setName(sc.next());
            System.out.println("输入修改之后的地址:");
            list.get(getIndex(list,id)).setAddress(sc.next());
            System.out.println("输入修改之后的年龄:");
            list.get(getIndex(list,id)).setAge(sc.nextInt());
        }else{
            System.out.println("当前ID未注册//");
        }
    }
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入ID：");
        String id=sc.next();
        int index=getIndex(list,id);
        if(index>=0){
            list.remove(index);
            System.out.println("删除成功");
        }else{
            System.out.println("当前id未注册//");
        }
    }
    public static void showStudent(ArrayList<Student> list){
        System.out.println("id\tname\tage\taddress");
        if(list.size()==0){
            System.out.println("暂无学生信息");
            return ;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
