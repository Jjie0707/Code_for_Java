package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入账号名:");
        String name=sc.nextLine();
        System.out.println("请输入密码:");
        String password=sc.nextLine();
        Login admin=new Login();

        admin.logIn(name,password);

    }
    public static void func(int n){
        if(n==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(666);
        }
    }

    public static void main0(String[] args) {

        try {
            func( new Scanner(System.in).nextInt());
        } catch ( ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println(777);
    }
}
