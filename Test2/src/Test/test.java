package Test;

import java.util.Scanner;

public class test {

    public static int hanoi(int n){
        if(n==1){
            return 1;
        }else{
            return 2*hanoi(n-1)+1;
        }
    }

    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1){
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }

    public static void move(char pos1,char pos2) {
        System.out.println(pos1+"->"+pos2+" ");
    }

    public static void main(String[] args) {
        System.out.println("请输入要移动的圆盘的数量:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("要移动"+hanoi(n)+"次");
        hanoi(n,'A','B','C');
    }
}
