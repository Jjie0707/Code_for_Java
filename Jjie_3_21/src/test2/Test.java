package test2;


import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("Jjie", 18, 94);
        Student s2 = new Student("Lu_", 17, 95.5);
        Student s3 = new Student("A", 16, 93);

        Student[] arr={s1,s2,s3};
        System.out.println("原始数组:");
        System.out.println(Arrays.toString(arr));
        AgeComparator a=new AgeComparator();
        StringComparator s=new StringComparator();

        System.out.println("按照年龄排序:");
        Arrays.sort(arr,a);
        System.out.println(Arrays.toString(arr));

        System.out.println("按照名字排序:");
        Arrays.sort(arr,s);
        System.out.println(Arrays.toString(arr));

    }

}
