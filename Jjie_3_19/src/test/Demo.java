package test;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
//        [[193,732],[781,962],[864,954],[749,627],
//        [136,746],[478,548],[640,908],[210,799],[567,715],[914,388]
//        ,[487,853],[533,554],[247,919],[958,150],[193,523],[176,656],
//        [395,469],[763,821],[542,946],[701,676]
        //{864,954},{749,627},{136,746},{478,548},{640,908},{210,799},{567,715},{914,388}
        int[][] arr={{193,732},{781,962},
                {487,853},{533,554},{247,919},{958,150},{193,523},{176,656},{395,469},
                {763,821},{542,946},{701,676},{864,954},{749,627},{136,746},{478,548},{640,908},{210,799},{567,715},{914,388}};
//        System.out.println(Arrays.deepToString(arr));
        quicksort(arr,0,arr.length-1);
//        int max=arr[0][1];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i][1]<max){
//                arr[i][1]=max;
//            }else{
//                max=arr[i][1];
//            }
//        }
        System.out.println(Arrays.deepToString(arr));
//        int key=205;
//        int index=binarySearch(arr,key);
//        while(index==-1){
//            key-=1;
//            index=binarySearch(arr,key);
//        }
//        System.out.println(index);
//        System.out.println(arr[binarySearch(arr, 205)][1]);
//        int[] queries={1,2,3,5};
//
//        for (int i = 0; i < queries.length; i++) {
//            System.out.println(arr[binarySearch(arr,queries[i])][1]);
//        }
    }
    public static int binarySearch(int[][] arr,int key){
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while(left<=right){
            int mid=(right+left)/2;
            if(arr[mid][0]<key){
                left=mid+1;
            }else if(arr[mid][0]>key){
                right=mid-1;
            }else{
                index=mid;
                break;
            }
        }
        return index;
    }

    public static boolean better(int[] arr1, int[] arr2) {
        if (arr1[0] < arr2[0]) {
            return true;
        } else if (arr1[0] == arr2[0] && arr1[1] > arr2[1]) {
            return true;
        } else {
            return false;
        }
    }



    public static int getMid(int[][] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (better(arr[left], arr[right])) {
            if (better(arr[mid], arr[left])) {
                return left;
            } else if (better(arr[right], arr[mid])) {
                return right;
            } else {
                return mid;
            }
        } else {
            if (better(arr[left], arr[mid])) {
                return left;
            } else if (better(arr[mid], arr[right])) {
                return right;
            } else {
                return mid;
            }
        }
    }

    public static void quicksort(int[][] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int k = getMid(arr, start, end);
        int[] tem = arr[start];
        arr[start] = arr[k];
        arr[k] = tem;

        int pit = start;
        int[] key = arr[pit];

        int left = start ;
        int right = end;
        while (left < right) {
            while ((!better(arr[right], key)) && left < right) {
                right--;
            }
            tem = arr[pit];
            arr[pit] = arr[right];
            arr[right] = tem;
            pit = right;
            while ((better(arr[left], key)) && left < right) {
                left++;
            }
            tem = arr[pit];
            arr[pit] = arr[left];
            arr[left] = tem;
            pit = left;
        }
        arr[pit] = key;
        quicksort(arr, start, pit - 1);
        quicksort(arr, pit + 1, end);
    }
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int length1=items.length;
        int length2=queries.length;
        int[] arr=new int[length2];
        // 现在对数组进行排序
        // 价格小的在前面
        // 价格相同的美丽值大的在前面（这样可以确保维护最大前缀时判断正确）
        quicksort(items,0,length1-1);
        int max=items[0][1];

        //遍历一遍数组
        // 可以将每个数组的美丽值设置为小于等于他这个价格最大的美丽值
        for (int i = 1; i < length1; i++) {
            if(items[i][1]<max){
                items[i][1]=max;
            }else{
                max=items[i][1];
            }
        }
        int i=0;
        for(int j=0;j<length2;j++){
            if(queries[j]<items[0][0]){
                arr[j]=0;
            }else if(queries[j]>=items[length1-1][0]){
                arr[j]=items[length1-1][1];
            }else{
                int index=binarySearch(items,queries[j]);
                if(!(index==-1)){
                    arr[j]=items[index][1];
                }else{
                    while(index==-1){
                        queries[j]-=1;
                        index=binarySearch(items,queries[j]);
                    }
                    //反正取到的也都是小于原来的价格的最大值
                    arr[j]=items[index][1];
                }
            }
        }
        return arr;
    }
}
