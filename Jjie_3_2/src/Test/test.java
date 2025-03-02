package Test;

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

    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }

    public static void main(String[] args) {
        char p1='A';
        char p2='B';
        char p3='C';
        hanoi(3,p1,p2,p3);
    }
}
