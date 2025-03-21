package test1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student("Jjie",95.5,18);
        Student s2=new Student("Jjet",94.0,21);
        Student s3=new Student("Lu_",96,19);

        Student[] arr={s1,s2,s3};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("按照年龄排序:");
        System.out.println(Arrays.toString(arr));
    }
}
