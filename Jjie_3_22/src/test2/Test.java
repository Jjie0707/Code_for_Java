package test2;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void bubble(Object[] arr, Comparator comparator){
        int length=arr.length;
        for (int i = 0; i < length-1; i++) {
            for(int j=0;j<length-1-i;j++){
                if(comparator.compare(arr[j],arr[j+1])>0){
                    Object tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }
    public static void main(String[] args) {
        Student s1=new Student("Jjie",18,98);
        Student s2=new Student("Lu_",16,93);
        Student s3=new Student("Lx",17,95);

        Student[] arr={s1,s2,s3};
        System.out.println(Arrays.toString(arr));
        bubble(arr,new AgeComparator());
        System.out.println("按照年龄排序");

        System.out.println(Arrays.toString(arr));
        bubble(arr,new NameComparator());
        System.out.println("按照名字排序");

        System.out.println(Arrays.toString(arr));

    }
}
