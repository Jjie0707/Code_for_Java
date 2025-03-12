package test;

import java.util.Arrays;
import java.util.Random;

//public class Test {
//
//    public class test1 {
//        public int aMethod() {
//            int i = 0;
//            i++;
//            return i;
//        }
//    }
//
//    public static void main(String args[]) {
//        test1 test1 = new test1();
//        test1.aMethod();
//        int j = test1.aMethod();
//        System.out.println(j);
//    }
//
//}
public class Test {
    /*
    简单题
 创建一个长度为5的整型数组，给每个元素赋值为其索引值的两倍，并打印所有元素
 编写Student类，包含姓名（name）和年龄（age）属性，并添加显示信息的方法display()
 编写方法sumArray(int[] arr)，计算并返回整型数组所有元素之和
 中等题
4. 创建包含3个Student对象的数组，遍历数组调用每个对象的display()方法
5. 设计BankAccount类，包含账号、余额属性，实现存款(deposit)和取款(withdraw)方法
6. 编写方法findMaxIndex(String[] arr)，返回字符串数组中长度最长的元素索引
进阶题
7. 实现图书类Book，包含书名、作者、是否借出状态，编写借阅borrow()和归还returnBook()方法
8. 编写方法transposeMatrix(int[][] matrix)，实现二维数组的矩阵转置（行列互换）
9. 创建汽车类Car，包含品牌、颜色、速度属性，实现加速和减速方法，创建3个实例并找出速度最快的汽车
挑战题
10. 设计学生管理系统，包含Student类（学号、成绩）和Classroom类（学生数组），实现添加学生、计算班级平均分、查找最高分学生的方法
     */
    public static void main7(String[] args) {
        int[][] arr=new int[][]{{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr));
        int[][] arr0=transposeMatrix(arr);
        System.out.println(Arrays.deepToString(arr0));

    }
    public static int[][] transposeMatrix(int[][] arr){
         int row=arr.length;
         int col=arr[0].length;
         int[][] arr0=new int[col][row];
         for(int i=0;i<arr.length;i++){
             for (int j = 0; j < arr[0].length; j++) {
                 arr0[j][i]=arr[i][j];
             }
         }
         return arr0;
    }
    public static int findMaxIndex(String[] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].length()>arr[max].length()){
                max=i;
            }
        }
        return max;
    }
    public static void main6(String[] args) {
        Student[] arr=new Student[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Student();
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
    }

    public static int sumArray(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main5(String[]  args) {
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=2*i;
        }

        System.out.print(Arrays.toString(arr));
    }
    public static void main4(String[] args) {
        Random r=new Random();
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            int tem=arr[i];
            int k=r.nextInt(arr.length);
            arr[i]=arr[k];
            arr[k]=tem;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main3(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int tem=arr[left];
            arr[left]=arr[right];
            arr[right]=tem;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main2(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        int tem=arr[0];
        arr[0]=arr[arr.length-1];
        arr[arr.length-1]=tem;
        System.out.println(Arrays.toString(arr));
    }
    public static void main1(String[] args) {
        int[] arr={33,5,77,33,44,55};
         int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.println("数组中的最大值是:"+max);
    }
    public int aMethod(){
        int i = 0;
        i++;
        return i;
    }
    public static void main0(String[] args){
        Test test = new Test();
        test.aMethod();
        int j = test.aMethod();
        System.out.println(j);
    }
}