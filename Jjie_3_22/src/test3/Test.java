package test3;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void bubbleSort(Object[] arr, Comparator comparator){
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
        Student s1=new Student("Jjie",18,94);
        Student s2=new Student("Lu_",19,92);
        Student s3=new Student("Lee",17,96);
        Student[] arr={s1,s2,s3};

        System.out.println("按照年龄排序:");
        bubbleSort(arr,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.age-o2.age;
            }
        });
        System.out.println(Arrays.toString(arr));

        System.out.println("按照姓名排序:");
        bubbleSort(arr,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
