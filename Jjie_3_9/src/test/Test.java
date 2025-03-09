package test;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{10,6,7,1};
        System.out.println("排序之前：");
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(arr));

        int[] arr0=new int[]{1,1,1,1,1,1,1};
        System.out.println("排序之前：");
        System.out.println(Arrays.toString(arr0));
        mergeSort(arr0);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(arr0));

        int[] arr1=new int[]{10,9,8,7,6,5,4,3,2,1};
        System.out.println("排序之前：");
        System.out.println(Arrays.toString(arr1));
        mergeSort(arr1);
        System.out.println("排序之后：");
        System.out.println(Arrays.toString(arr1));
    }
    public static void mergeSort(int[] arr){
        int[] tem=new int[arr.length];
        mergeSort(arr,0,arr.length-1,tem);
    }
    public static void mergeSort(int[] arr,int start,int end,int[] tem){
        //同样子区间长度小于等于1 可视为有序
        if(start>=end){
            return ;
        }

        int mid=(start+end)/2;

        mergeSort(arr,start,mid,tem);
        mergeSort(arr,mid+1,end,tem);

        int left1=start;
        int right1=mid;
        int left2=mid+1;
        int right2=end;
        int i=start;
        while(left1<=right1 && left2<=right2){
            if(arr[left1]<arr[left2]){
                tem[i]=arr[left1];
                left1++;
            }else{
                tem[i]=arr[left2];
                left2++;
            }
            i++;
        }
        while(left1<=right1){
            tem[i]=arr[left1];
            left1++;
            i++;
        }
        while(left2<=right2){
            tem[i]=arr[left2];
            left2++;
            i++;
        }
        for(i=start;i<=end;i++){
            arr[i]=tem[i];
        }
    }

    public static void main0(String[] args) {
        int[] arr=new int[]{5,3,2,2,6,8,9,7,0,1,4};
        System.out.println("排序之前");
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("排序之后");
        System.out.println(Arrays.toString(arr));

        int[] arr1=new int[]{1,1,1,};
        System.out.println("排序之前");
        System.out.println(Arrays.toString(arr1));
        quickSort(arr1,0,arr1.length-1);
        System.out.println("排序之后");
        System.out.println(Arrays.toString(arr1));

        int[] arr2=new int[]{3,2,1};
        System.out.println("排序之前");
        System.out.println(Arrays.toString(arr2));
        quickSort(arr2,0,arr2.length-1);
        System.out.println("排序之后");
        System.out.println(Arrays.toString(arr2));
    }

    //前后下标实现第一趟快速排序
    public static void quickSort(int[] arr,int start,int end){
        if(start>=end){
            return ;
        }

        int k=getMid(arr,start,end);
        int tem=arr[start];
        arr[start]=arr[k];
        arr[k]=tem;

        int cur=start;
        int pre=start;

        while(cur<end)
        {
            cur++;
            if(arr[cur]<=arr[start]) {
                pre++;
                tem=arr[cur];
                arr[cur]=arr[pre];
                arr[pre]=tem;
            }
        }
        tem=arr[pre];
        arr[pre]=arr[start];
        arr[start]=tem;
        quickSort(arr,start,pre-1);
        quickSort(arr,pre+1,end);
    }

    //双下标实现第一趟排序 后面递归(start,end都是下标)
    public static void quickSort1(int[] arr,int start,int end){
        //子区间的长度小于等于一时可认为他是有序的
        if(start>=end){
            return ;
        }

        //利用三数取中找到了不算极端的key
        int k=getMid(arr,start,end);
        int tem=arr[k];
        arr[k]=arr[start];
        arr[start]=tem;
        int key=arr[start];

        int left=start;
        int right=end;
        while(left<right){
            //左找大于 (严格大于) key 右边找小于 (严格小于) key 两者交换
            while(left<right && arr[right]>=key){
                right--;
            }
            while(left<right && arr[left]<=key){
                left++;
            }
            tem=arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
        }
        //再将key
        tem=arr[start];
        arr[start]=arr[right];
        arr[right]=tem;
        quickSort(arr,start,left-1);
        quickSort(arr,left+1,end);
    }

    public static int getMid(int[] arr,int left,int right){
        int mid=(left+right)/2;{
            if(left==right){
                return left;
            }
        }
        if(arr[mid]>arr[left]){
            if(arr[left]>arr[right]){
                return left;
            }
            else if(arr[right]>arr[mid]){
                return mid;
            }else{
                return right;
            }
        }else{
            if(arr[mid]>arr[right]){
                return mid;
            }else if(arr[right]>arr[left]){
                return left;
            }else{
                return right;
            }
        }
    }

    //挖坑法实现第一躺排序 后面递归(start,end都是下标)
    public static void quickSort0(int[] arr, int start, int end) {
        //子区间的长度小于等于一时可认为他是有序的
        if (start >= end) {
            return;
        }
        //现在完成了一趟快排，现在刚好有一个数字处在了正确的位置

        //利用三数取中找到中间数的下标 并将他与开始的数字交换
        //后面逻辑不变 依旧挖坑
        int k=getMid(arr,start,end);
        int tem=arr[k];
        arr[k]=arr[start];
        arr[start]=tem;

        int key = arr[start];
        int left = start;
        int right = end;
        int pit = left;
        while (left < right) {
            //右边找到比key小的元素
            while(left<right && arr[right]>=key){
                right--;
            }
            arr[pit]=arr[right];
            pit=right;
            //左边找到比key大的元素
            while(left<right && arr[left]<=key){
                left++;
            }
            arr[pit]=arr[left];
            pit=left;
        }
        arr[pit] = key;
        quickSort(arr, start, pit - 1);
        quickSort(arr, pit + 1, end);
    }

}
