import java.util.Scanner;



public class Main {
    
    public static void main1(String[] args) {
        int count=0;
        for(int i=101;i<=200;i++){
            if(find(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println(count);
    }
    public static boolean find(int n){
        if(n<2){
            return false;
        } else if (n==2) {
            return true;
        }else{
            for(int i=2;i<=Math.sqrt((double)n)+1;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
    public static void main0(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();
            Sub sub = new Sub(x, y, z);
            System.out.println(sub.calculate());
        }
    }

}

/**
 * 有父类Base，内部定义了x、y属性。有子类Sub，继承自父类Base。
 * 子类新增了一个z属性，并且定义了calculate方法，
 * 在此方法内计算了父类和子类中x、y、z属性三者的乘积。请补全子类构造方法的初始化逻辑，使得该计算逻辑能够正确执行
 */
class Base {

    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}

class Sub extends Base {

    private int z;

    public Sub(int x, int y, int z) {
        //write your code here
        super(x,y );
        this.z=z;
    }

    public int getZ() {
        return z;
    }

    public int calculate() {
        return super.getX() * super.getY() * this.getZ();
    }

}