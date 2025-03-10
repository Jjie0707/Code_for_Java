package test;

import java.util.Arrays;

public class Test {
    //利用非递归实现归并排序
    public static void mergeSort(int[] arr){
        int[] tem=new int[arr.length];

        int length=1;
        while(length<arr.length){
            for(int i=0;i<arr.length;i+=2*length){
                //[i,i+gap-1] [i+gap,i+2*gap-1]
                int left1=i;
                int right1=i+length-1;

                int left2=i+length;
                int right2=i+2*length-1;

                //如果右边区间不存在 只有左边 则不用归并
                if(right1>=arr.length || left2>=arr.length){
                    continue;
                }

                //如果右区间存在但是不完整「
                if(left2<arr.length && right2>=arr.length){
                    right2=arr.length-1;
                }
                int k=left1;
                int j=k;
                int len=right2-left1+1;
                while(left1<=right1 && left2<=right2){
                    if(arr[left1]<arr[left2]){
                        tem[k]=arr[left1];
                        left1++;
                        k++;
                    }else{
                        tem[k]=arr[left2];
                        left2++;
                        k++;
                    }
                }
                while(left1<=right1){
                    tem[k]=arr[left1];
                    left1++;
                    k++;
                }
                while(left2<=right2){
                    tem[k]=arr[left2];
                    left2++;
                    k++;
                }
                for(;len>0;len--){
                    arr[j]=tem[j];
                    j++;
                }
            }
            length*=2;
        }
    }
    public static void main(String[] args) {
//        System.out.println("Jjie");

        int[] arr1=new int[]{3, 1, 4, 2, 5};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr1));
        mergeSort(arr1);
        System.out.println("排序之后的数组：");
        System.out.println(Arrays.toString(arr1));

        int[] arr3=new int[]{4,3,7,1};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr3));
        mergeSort(arr3);
        System.out.println("排序之后的数组：");
        System.out.println(Arrays.toString(arr3));

        int[] arr=new int[]{10,6,7,1,3,9,4,2,4,3,2};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("排序之后的数组：");
        System.out.println(Arrays.toString(arr));

        int[] arr0=new int[]{10,9,8,7,6,5,4,3,2,1,0};
        System.out.println("排序之前的数组：");
        System.out.println(Arrays.toString(arr0));
        mergeSort(arr0);
        System.out.println("排序之后的数组：");
        System.out.println(Arrays.toString(arr0));


    }
}
