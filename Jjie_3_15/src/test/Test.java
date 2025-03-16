package test;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},
                {3,2},
                {2,4},
                {5,6},
                {3,5}
        };
        System.out.println(Arrays.deepToString(arr));
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.deepToString(arr));

    }
    public static boolean better(int[] arr1,int[] arr2){
        if(arr1[0]<arr2[0]){
            return true;
        }else if(arr1[0]==arr2[0] && arr1[1]>arr2[1]){
            return true;
        }else{
            return false;
        }
    }
    public static int getMid(int[][] arr,int left,int right){
        int mid=(left+right)/2;
        if(better(arr[left],arr[right])){
            if(better(arr[mid],arr[left])){
                return left;
            }else if(better(arr[right],arr[mid])){
                return right;
            }else{
                return mid;
            }
        }else {
            if (better(arr[left], arr[mid])) {
                return left;
            } else if (better(arr[mid], arr[right])) {
                return right;
            } else {
                return mid;
            }
        }
    }
    public static void quicksort(int[][] arr,int start,int end){
        if(start>=end){
            return;
        }
        int k=getMid(arr,start,end);
        int[] tem=arr[start];
        arr[start]=arr[k];
        arr[k]=tem;

        int pit=start;
        int[] key=arr[pit];

        int left=start+1;
        int right=end;
        while(left<right){
            while((!better(arr[right],key)) && left<right){
                right--;
            }
            tem=arr[pit];
            arr[pit]=arr[right];
            arr[right]=tem;
            pit=right;
            while((better(arr[left],key))&& left<right){
                left++;
            }
            tem=arr[pit];
            arr[pit]=arr[left];
            arr[left]=tem;
            pit=left;
        }
        arr[pit]=key;
        quicksort(arr,start,pit-1);
        quicksort(arr,pit+1,end);
    }
    //或者可以直把数组给打乱 随机索引交换
    public static void main3(String[] args) {
        int[] arr={88,888,188,0,1,666};
        Random rd=new Random();
        for (int i = 0; i < arr.length-1;) {
            int k=rd.nextInt(6);
            if(arr[k]>=0){
                if(arr[k]!=0) {
                    System.out.println(arr[k] +"被抽到");
                }else{
                    System.out.println("很遗憾未中奖");
                }
                i++;
                arr[k]=-1;
            }
        }
    }

    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=getEach(k);
        _decrypt(arr,k);
        turn(arr);
        System.out.println(decrypt(arr));
    }
    public static void _decrypt(int[] arr,int n){
        int i=arr.length-1;
        while(n>0){
            arr[i]=(((n%10)+10)-5)%10;
            i--;
            n/=10;
        }
    }
    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] arr=getEach(k);
        encryption(arr,k);
        turn(arr);
        System.out.println(decrypt(arr));
    }
    public static int decrypt(int[] arr){
        int ret=0;
        for (int i = 0; i < arr.length; i++) {
            ret=ret*10+arr[i];
        }
        return ret;
    }
    public static int[] getEach(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        int[] arr=new int[count];
        return arr;
    }
    public static void encryption(int[] arr,int n){
        int i=0;
        while(n>0){
            arr[i]=((n%10)+5)%10;
            i++;
            n/=10;
        }
        turn(arr);
    }
    public static void turn(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int tem=arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
            left++;
            right--;
        }
    }
    public static int[] getScores(){
        int[] arr=new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            int k=sc.nextInt();
            if(k<=100 && k>=0){
                arr[i] = k;
                i++;
            }else{
                System.out.println("输入非法，重新输入");
            }
        }
        return arr;
    }
    public static int getEve(int[] arr){
        int max=arr[0];
        int min=arr[0];
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
            sum+=arr[i];
        }
        sum=sum-max-min;
        return sum/4;
    }
    public static void main0(String[] args) {
        int[] arr=getScores();
        System.out.println(getEve(arr));
    }
}
