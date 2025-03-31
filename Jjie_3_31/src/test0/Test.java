package test0;
import java.util.Arrays;
import java.util.Scanner;
public class Test {
    public static int getAdd(int[] arr,int index,int k){
        int ret=0;
        for(int i=index;i<index+k;i++){
            for(int j=i+1;j<index+k;j++){
                ret+=(arr[j]-arr[i]);
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size=scan.nextInt();
        int k=scan.nextInt();

        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            arr[i]=scan.nextInt();
        }//读取了所有队员的能力值

        //在此输入您的代码...
        //这里进行排序
        Arrays.sort(arr);
        int m=getAdd(arr,0,k);
        for(int i=1;i+k<size;i++){
            m=Math.min(m,getAdd(arr,i,k));
        }
        System.out.println(m);
        scan.close();
    }
    public static int fright(String s,int index,int length){
        for(int i=index+1;i<length;i++){
            if(s.charAt(i)=='1'){
                return i;
            }
        }
        return -1;
    }
    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        int n=scan.nextInt();
        String s=scan.next();
        int left=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                left=i;
            }else{
                int right=fright(s,i,n);
                if(left==-1 && right==-1){
                    System.out.print(-1+" ");
                }else{
                    if(left==-1){
                        System.out.print(right-i+" ");
                    }else if(right==-1){
                        System.out.print(i-left+" ");
                    }else{
                        int j=Math.min(right-i,i-left);
                        System.out.print(j+" ");
                    }
                }
            }
        }
        scan.close();
    }
    public static void main0(String[] args) {
        Scanner scan = new Scanner(System.in);
        //在此输入您的代码...
        String s=scan.nextLine();
        int length=s.length();
        int max=0;
        int count=0;
        for(int i=0;i<length;i++){
            char c=s.charAt(i);
            if(c=='a'){
                count++;
            }else{
                if(count>=max){
                    max=count;
                }
                count=0;
            }
        }
        if(count>=max){
            max=count;
        }
        //现在已经找到了 S中最大的连续a的个数 max
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<max+1;i++){
            sb.append("a");
        }
        System.out.println(sb);
        scan.close();
    }
}
