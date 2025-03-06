package Test;

public class test {
    


    public static void main6(String[] args) {
        int[][] arr=new int[2][3];
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[0][0]);

        int[][] arr2=new int[2][];
        arr2[0]=new int[]{1,2,3};
        System.out.println(arr2[1]);

        int[][] arr1=new int[2][];
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
    }

    public static void main5(String[] args) {
        Dog dog1=new Dog();
        dog1.makeDog("臭🐶","black");
        dog1.bark();
    }


    //ShellSort希尔排序
    public static void shellSort(int[] arr){
        int gap=arr.length;
        while(gap>=1){
            int end=0;
            while(end<(arr.length-gap)){
                int k=end;
                int tem=arr[k+gap];
                while(k>=0){
                    if(tem<arr[k]){
                        arr[k+gap]=arr[k];
                    }else{
                        break;
                    }
                    k-=gap;
                }
                arr[k+gap]=tem;
                end+=1;
            }
            gap/=2;
        }
    }
    public static void main4(String[] args) {
        int[] arr=new int[]{9,3,5,2,7,8,6,-1,9,4,0};
        System.out.println("排序之前");
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        shellSort(arr);
        System.out.println("排序之后");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }


    public static int bSearch(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        int mid=0;
        boolean flag=false;
        while(left<=right){
            mid=(left+right)/2;
            if(arr[mid]>k){
                right=mid-1;
            }else if(arr[mid]<k){
                left=mid+1;
            }else{
                flag=true;
                break;
            }
        }
        if(!flag){
            return -1;
        }else{
            return mid;
        }
    }
    public static void main3(String[] args) {
        int[] arr1=new int[] {1,2,3};
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9,10,13,14,15,16,17,19,23,25};
        System.out.println(bSearch(arr,5));
        System.out.println(bSearch(arr,17));
        System.out.println(bSearch(arr,10));
        System.out.println(bSearch(arr,23));
        System.out.println(bSearch(arr,25));
        System.out.println(bSearch(arr,1));
        System.out.println(bSearch(arr1,1));
    }


    //直接插入排序
    public static void insertSort(int[] arr){
        int end=0;
        while(end<arr.length-1){
            int k=end;
            int tem=arr[k+1];
            while(k>=0){
                if(tem<arr[k]){
                    arr[k+1]=arr[k];
                }else{
                    break;
                }
                k--;
            }
            arr[k+1]=tem;
            end++;
        }
    }
    public static void main2(String[] args) {
        int[] arr=new int[]{9,3,5,2,7,8,6,-1,9,4,0};
        System.out.println("排序之前");
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        insertSort(arr);
        System.out.println("排序之后");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }


    //直接选择排序
    public static void selectSort(int[] arr){
        int begin=0;
        int end=arr.length-1;
        while(begin<end) {
            int left = begin;
            int right = end;
            int min=(arr[left]<arr[right]?left:right);
            int max=(arr[left]>arr[right]?left:right);
            while (left <= right) {
                if(arr[left]<arr[min]){
                    min=left;
                }else if(arr[left]>arr[max]){
                    max=left;
                }
                if(arr[right]>arr[max]){
                    max=right;
                }else if(arr[right]<arr[min]){
                    min=right;
                }
                left++;
                right--;
            }
            int tem=0;
            tem=arr[begin];
            arr[begin]=arr[min];
            arr[min]=tem;
            if(max==begin){
                max=min;
            }
            tem=arr[end];
            arr[end]=arr[max];
            arr[max]=tem;

            begin++;
            end--;
        }
    }
    public static void main1(String[] args) {
        int[] arr=new int[]{9,3,5,2,7,8,6,-1,9,4,0};
        System.out.println("排序之前");
        for (int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        selectSort(arr);
        System.out.println("排序之后");
        for (int x:arr){
            System.out.print(x+" ");
        }
    }
}
