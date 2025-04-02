package user;

import book.Book;
import constant.Constant;
import library.Library;
import utils.ScannerSingleton;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AdminUser extends User{
    private String name;
    private String userId;

    public void addBook(){
        Scanner sc= ScannerSingleton.sc;
        Book book=new Book();
        System.out.println("请输入要添加的书籍的书名:");
        book.setBookName(sc.nextLine());
        System.out.println("请输入要添加的书籍的作者:");
        book.setWriterName(sc.nextLine());
        System.out.println("请输入要添加的书籍的出版日期,形如“yyyy-mm-dd”:");
        book.setPublishTime(LocalDateTime.parse(sc.nextLine(),DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        book.setShelfTime(LocalDateTime.now());
        Library.library.addbook(book);
    }


    public AdminUser() {
    }

    public AdminUser(String name, String userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getMaxborrowedcount() {
        return maxborrowedcount;
    }

    public void setMaxborrowedcount(int maxborrowedcount) {
        this.maxborrowedcount = maxborrowedcount;
    }
}
