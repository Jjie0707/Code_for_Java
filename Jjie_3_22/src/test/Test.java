package test;

import java.util.Arrays;

public class Test {
    public static void bubbleSort(Student[] arr){
        int length=arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-1-i;j++){
                if(arr[j].compareTo(arr[j+1])>0){
                    Student tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
    }
    //  同时实现类使用Comparable接口进行排序 深拷贝
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student("Jjie",18,91,new Lesson("Chinese"));
        Student s2=(Student)s1.clone();
        s1.lesson.classname="Math";
        System.out.println(s2);
        s2.age=19;
        s2.name="Lu_";
        Student s3=new Student("Lx",18,98,new Lesson("Chemistry"));

        Student[] arr={s1,s2,s3};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
