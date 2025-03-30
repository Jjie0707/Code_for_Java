package test1;

import java.util.ArrayList;

public class Test {
    public static boolean func(ArrayList<User> list,String id){
        int length=list.size();
        for(int i=0;i<length;i++){
            if(list.get(i).getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<User> list=new ArrayList();

        User s1=new User("Jjie","1001","123456");
        User s2=new User("Jjet","1002","260729");
        User s3=new User("Lu_","1003","260822");
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(func(list,"1005"));
        System.out.println(func(list,"1003"));
        System.out.println(func(list,"1001"));
    }
}
