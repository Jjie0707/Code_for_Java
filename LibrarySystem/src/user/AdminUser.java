package user;

import book.Book;
import constant.Constant;
import library.Library;
import utils.ScannerSingleton;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class AdminUser extends User {
    private String name;
    private String userId;

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

    public void addBook() {
        Scanner sc = ScannerSingleton.sc;
        Book book = new Book();
        System.out.println("请输入要添加的书籍的书名:");
        book.setBookName(sc.nextLine());
        System.out.println("请输入要添加的书籍的作者:");
        book.setWriterName(sc.nextLine());
        System.out.println("请输入要添加的书籍的出版日期,形如“yyyy-mm-dd”:");
        book.setPublishTime(LocalDateTime.parse(sc.nextLine()));
        book.setShelfTime(LocalDateTime.now());
        book.setId(Library.library.getAllBookNum()+1+"");
        Library.library.addbook(book);
    }
    public void findBook(){
        Library.library.findBook();
    }
    public void showBook(){
        Library.library.showBook();
    }
    public void quitSystem(){
        Library.library.quitSystem();
    }
    public void updateBook(){
        Library.library.showBook();
        System.out.println("请输入要修改的书籍的id:");
        Scanner sc=ScannerSingleton.sc;
        String id=sc.nextLine();
        int index=Library.library.find(id);
        if(!(index==-1)) {
            System.out.println("请输入修改后的书名");
            Library.library.getAllbook()[index].setBookName(sc.nextLine());
            System.out.println("请输入修改后的作者");
            Library.library.getAllbook()[index].setWriterName(sc.nextLine());
            System.out.println("请输入修改之后的出版时间");
            Library.library.getAllbook()[index].setPublishTime(LocalDateTime.parse(sc.nextLine()));
            Library.library.getAllbook()[index].setShelfTime(LocalDateTime.now());
            Library.library.getAllbook()[index].setAvailable(true);
            Library.library.getAllbook()[index].setBorrowCount(0);
            System.out.println("更新成功,以下是更新后的信息:");
            System.out.println(Library.library.getAllbook()[index]);
            Library.library.updateBook();
        }
    }
    public void deleteBook(){
        Library.library.deleteBook();
    }

    public void getBorrowedCount() {
        Library.library.getBorrowedCount();
    }
    public void getPopularity(){
        Library.library.getPopularity();
    }
    public void getInventoryStatus(){
        Library.library.getInventoryStatus();
    }

    public void removeOldBook() {
        Library.library.removeOldBook();
    }
}
