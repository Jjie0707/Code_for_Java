package Test;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr=new int[]{2,1,4,6};
        int[] arr1=new int[]{1,2,34,3,4,5,7,23,12};
        System.out.println(Arrays.toString(arr));
        System.out.println(func(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(func(arr1));;


    }
    public static boolean func(int[] arr){
        boolean flag=false;
        for(int i=0;i<arr.length-3;i++){
            if(arr[i]%2==1){
                if(arr[i+1]%2==1 && arr[i+2]%2==1){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    public static int mostNum(int[] arr){
        int num=arr[0];
        int ret=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==num){
                ret+=1;
            }else{
                if(ret==1){
                    num=arr[i];
                }else{
                    ret-=1;
                }
            }
        }
        return num;
    }

    public static void main9(String[] args) {
        int[] arr=new int[]{2,2,1,1,1,2,2};
        int[] arr1=new int[]{3,2,3};
        System.out.println(mostNum(arr));
        System.out.println(mostNum(arr1));
    }

    public static boolean findN(int[] arr){
        int num1=(arr[0]>arr[1]?arr[1]:arr[0]);
        int num2=(arr[0]>arr[1]?arr[0]:arr[1]);
        for(int i=2;i<arr.length;i++){
            if(arr[i]>num2){
                int tem=num2;
                num2=arr[i];
                num1=tem;
            }
        }
        if(num2>2*num1){
            return true;
        }
        else{
            return false;
        }
    }

    public static int Find(int[] arr){
        int ret=0;
        for(int x:arr){
            ret^=x;
        }
        return ret;
    }

    public static void main8(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,1,2,3,4,6};
        System.out.println("只出现一次的数字是："+Find(arr));
    }
    public static int[] SumEqual(int[] arr,int target){
        int[] arr1=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    arr1[0]=i;
                    arr1[1]=j;
                }
            }
        }
        return arr1;
    }

    public static void main1(String[] args) {
        int[] arr=new int[]{11,7,15,2};
        int target=9;
        System.out.println(Arrays.toString(SumEqual(arr,target)));
    }

    public static void BubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }

    public static void main2(String[] args) {
        int[] arr=new int[]{4,8,9,0,7,3,2,5,6,1};
        System.out.println("排序之前的数组：");
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println("\n");
        BubbleSort(arr);
        System.out.println("排序之后的数组：");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
    public static int BinarySearch(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        int ret=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>k){
                right=mid-1;
            } else if (arr[mid]<k) {
                left=mid+1;
            }else{
                ret=mid;
                break;
            }
        }
        //返回待查找元素的下标
        //未找到返回-1
        return ret;
    }

    public static void main7(String[] args) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(BinarySearch(arr,7));
        System.out.println(BinarySearch(arr,1));
        System.out.println(BinarySearch(arr,4));
        System.out.println(BinarySearch(arr,15));
    }

   public static void Change(int[] arr){
       int left=0;
       int right=arr.length-1;
       while(left<right){
           while(arr[left]%2!=0){
               left++;
           }while(arr[right]%2==0){
               right--;
           }
           int tem=arr[left];
           arr[left]=arr[right];
           arr[right]=tem;
           left++;
           right--;
       }
   }

    public static void main4(String[] args) {
        int[] arr=new int[]{3,4,6,2,1,0,9,7,8,5};
        Change(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }

    public static void transform(int[] arr){
        for (int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
    }

    public static void main6(String[] args) {
        int[] arr =new int[]{1,2,3};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static String ToString(int[] arr){
        if(arr.length==0){
            return "";
        }
        String str="[";
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                str+=arr[i];
            }else{
                str+=(arr[i]+",");
            }
        }
        str+="]";
        return str;
    }

    public static void main5(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(ToString(arr));
    }
    public static void main3(String[] args) {
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        for(int x:arr){
            System.out.println(x);
        }
    }
}
