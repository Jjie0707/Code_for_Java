package test2;

import java.util.ArrayList;

public class Test {
    public static ArrayList<Phone> func(ArrayList<Phone> list){
        int length=list.size();
        ArrayList<Phone> ret=new ArrayList();
        for(int i=0;i<length;i++){
            if(list.get(i).getPrice()<3000){
                ret.add(list.get(i));
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Phone p1=new Phone("小米",1999);
        Phone p2=new Phone("Apple",8999);
        Phone p3=new Phone("三星",7999);
        ArrayList<Phone> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> ret =func(list);
        for(int i=0;i<ret.size();i++){
            System.out.println(ret.get(i).getName()+","+ret.get(i).getPrice());
        }
    }
}
