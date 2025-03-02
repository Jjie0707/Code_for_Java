package Test;

import java.util.Scanner;

public class test {
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if (n == 1) {
            move(pos1, pos3);
        } else {
            hanoi(n - 1, pos1, pos3, pos2);
            move(pos1, pos3);
            hanoi(n - 1, pos2, pos1, pos3);
        }
    }

    public static int hanio(int n){
        if(n==1){
            return 1;
        }
        else{
            return 2*hanio(n-1)+1;
        }
    }

    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char p1='A';
        char p2='B';
        char p3='C';
        System.out.print("要移动的圆盘数量为：");
        int n=sc.nextInt();
        hanoi(n,p1,p2,p3);
        System.out.println("\n期间移动了"+hanio(n)+"次");
    }
}
