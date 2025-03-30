package test3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class Test {
    //随机生成索引
    public static int func1(char[] arr){
        Random r=new Random();
        int i;
        while(true){
            i=r.nextInt(arr.length);
            if(arr[i]==0){
                break;
            }
        }
        return i;
    }
    //随机生成英文字符
    public static char func2(){
        Random r=new Random();
        char c=(char)(r.nextInt(26)+65);
        return c;
    }
    //随机生成数字字符
    public static char func3(){
        Random r=new Random();
        char c=(char)(r.nextInt(10)+48);
        return c;
    }
    public static char[] func(){
        char[] ch={0,0,0,0,0};
        for(int i=0;i<ch.length;i++){
            int j=func1(ch);
            if(i==ch.length-1){
                char c=func3();
                ch[j]=c;
            }else{
                char c=func2();
                ch[j]=c;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        char[] arr=func();
        String id=new String(arr);
        System.out.println(id);
    }

}
