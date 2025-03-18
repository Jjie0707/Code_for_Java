package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str1="Hello World!";
        System.out.println("str1:"+str1);
        String str2=new String();
        System.out.println("str2:" + str2);
    }
    public static void main2(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个小数");
        double v = sc.nextDouble();
        System.out.println(v);
    }
    //找到了返回索引，没找到返回-1
    public static int findArray(Student[] arr,int index){
        int ret=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null &&  arr[i].getId()==index){
                return i;
            }
        }
        return ret;
    }
    public static boolean inArray(Student[] arr,int id){
        for (int i = 0; i < arr.length; i++) {
            int id1=arr[i].getId();
            if(id==id1){
                return true;
            }
        }
        return false;
    }
    public static int getCount(Student[] arr){
        //数组满了会返回true 没满会返回false
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null){
                count++;
            }
        }
        return count;
    }

    public static void main1(String[] args) {
        Student s1 = new Student("zhangsan", 1024, 19);
        Student s2 = new Student("lisi", 1025, 18);
        Student s3 = new Student("wangwu", 1026, 22);
        Student[] arr =new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        int id1=1025;
        int id2=1025;
        if(findArray(arr,id1)!=-1){
            arr[findArray(arr,id1)]=null;
            printArr(arr);

        }else{
            System.out.println("当前id不存在，删除失败");
        }
        if(findArray(arr,id2)!=-1){
            arr[findArray(arr,id2)].setAge(arr[findArray(arr,id2)].getAge()+10);
            System.out.println("操作完成!");
            printArr(arr);
        }else{
            System.out.println("当前ID不存在，修改失败");
        }
    }
    public static void main0(String[] args){
        Student s1 = new Student("zhangsan", 1024, 19);
        Student s2 = new Student("lisi", 1025, 18);
        Student s3 = new Student("wangwu", 1026, 22);
        Student[] arr =new Student[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        System.out.println("这是初始数组:");
        printArr(arr);
        Student s4=new Student("zhaoliu",1027,20);
        if(!inArray(arr,s4.getId())){
            int count=getCount(arr);
            if(count!=arr.length){
                arr[count]=s4;
            }else{
                Student[] arr1=new Student[arr.length+1];
                for (int i = 0; i < arr.length; i++) {
                    arr1[i]=arr[i];
                }
                arr1[arr.length]=s4;
                arr=arr1;
            }
        }else{
            System.out.println("ID"+s4.getId()+"已存在！修改ID再添加");
        }
        System.out.println("这是修改之后数组:");
        printArr(arr);
    }
    public static void printArr(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==null){
                continue;
            }
            System.out.print(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getAge());
            System.out.println();
        }
    }
}
