package test;

import java.util.Scanner;

public class Test {
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
