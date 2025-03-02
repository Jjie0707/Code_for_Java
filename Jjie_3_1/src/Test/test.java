package Test;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Sum(a));
    }
    public static int Sum(int n){
        if(n<10){
            return n;
        }
        else{
            return n%10+Sum(n/10);
        }
    }
}
