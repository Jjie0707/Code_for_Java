package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("输入一个整数");
        int i=sc.nextInt();
        System.out.println(i);
        System.out.println("输入一个字符串");
        String str=sc.next();
        System.out.println(str);
    }
    public static void main0(String[] args) {
        Role r1=new Role(100,"夜斗");
        Role r2=new Role(100,"野良");

        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O"+r2.getName());
                break;
            }
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O"+r1.getName());
                break;
            }

        }
    }
}
