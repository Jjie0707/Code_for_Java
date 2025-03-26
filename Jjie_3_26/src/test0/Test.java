package test0;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class Test {
    public static void main(String[] args) {
        //直接获取当前的时间
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        //直接传数据构造时间
        LocalDateTime ldt0=LocalDateTime.of(2025,3,26,22,34,34);
        System.out.println(ldt0);

        //读取字符串获取时间,对字符串格式有要求
        LocalDateTime ldt1=LocalDateTime.parse("2025-03-26T22:46:14.050975");
        System.out.println(ldt1);

        //传字符串和时间构造器
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        LocalDateTime ldt2=LocalDateTime.parse("2006-08-22 20-13-14",dtf);
        System.out.println(ldt2);
    }
}
