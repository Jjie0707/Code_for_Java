package test2;

import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String s=sc.nextLine();
        int length=s.length();
        char[] ch=s.toCharArray();
        for(int i=0;i<length;i++){
            char tem=ch[i];
            int r=random.nextInt(length);
            ch[i]=ch[r];
            ch[r]=tem;
        }
        s=new String(ch);
        System.out.println(s);
    }
    //Ⅰ   Ⅱ   Ⅲ    Ⅳ    Ⅴ    Ⅵ    Ⅶ    Ⅷ    Ⅸ    Ⅹ

    //把左边第一个字符移到最后
    public static String reverse(String a){
        String tem=a.substring(0,1);
        return (a.substring(1)+tem);
    }
    public static boolean func(String a,String b){
        int length=a.length();
        for(int i=0;i<length;i++){
            a=reverse(a);
            if(a.equals(b)){
                return true;
            }
        }
        return false;

    }
    public static void main0(String[] args) {
        String a="abcde";
        String b="abcde";
        System.out.println(func(a,b));
    }
}
