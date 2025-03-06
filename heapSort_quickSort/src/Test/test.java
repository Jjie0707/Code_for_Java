package Test;

public class test {
    public static void adjustDown(int[] arr,int parent,int size){
        int child=(2*parent+1);
        while(child<size){
            if(child+1<size){
                //调整大小堆时只需把这里的符号和下面父子比较的符号取反
                if(arr[child]<arr[child+1]){
                    child++;//child取较大的一个子节点（大堆）
                }
            }//小的数字向下调整（大堆）
            if(arr[child]>arr[parent]){
                int tem=arr[parent];
                arr[parent]=arr[child];
                arr[child]=tem;
            }
            parent=child;
            child=(2*parent+1);
        }
    }//建堆的函数 从下往上建堆
    public static void buildHeap(int[] arr,int size){
        for(int i=((size-1-1)/2);i>=0;i--){
            adjustDown(arr,i,size);
        }
    }//堆排序本体函数 将堆顶的数字调整到数组的尾部
    public static void heapSort(int[] arr){
        int size=arr.length;
        buildHeap(arr,size);
        int end=size-1;
        while(end>=0){
            adjustDown(arr,0,end+1);
            int tem=arr[0];
            arr[0]=arr[end];
            arr[end]=tem;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,4,6,9,3,0,8,6,1,-1,9};
        System.out.println("这是排序之前的数组:");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        heapSort(arr);
        System.out.println("这是排序之后的数组:");
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
