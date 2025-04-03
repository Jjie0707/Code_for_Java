package library;

import LibrarySystem.LibrarySystem;
import book.Book;
import com.bit.utils.FileUtils;
import constant.Constant;
import user.NomalUser;
import user.ProxyUser;
import utils.ScannerSingleton;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;


public class Library {
    public static final Library library=new Library();
    private Book[] allbook; //存放所有图书及其相关信息的数组
    private BorrowedBook[] allborrowedbook; //存放被借阅图书和借阅者ID信息的数组
    private int allBookNum;
    private int borrowedBookNum;

    public Book[] getAllbook() {
        return allbook;
    }

    public void setAllbook(Book[] allbook) {
        this.allbook = allbook;
    }

    public BorrowedBook[] getAllborrowedbook() {
        return allborrowedbook;
    }

    public void setAllborrowedbook(BorrowedBook[] allborrowedbook) {
        this.allborrowedbook = allborrowedbook;
    }

    public int getAllBookNum() {
        return allBookNum;
    }

    public void setAllBookNum(int allBookNum) {
        this.allBookNum = allBookNum;
    }

    public Book[] loadBook(){
        //从文件里读取的存有所有图书信息的字符串，以\n分割
        String data=FileUtils.readFile(Constant.FILE_NAME);
        if(data.equals("")){
            allbook=new Book[Constant.Default_sizing];
            allBookNum=0;  //存储的图书的真实数量  读取到的字符串为空 说明文件中没有存储图书的信息 孜然味0
            System.out.println("数据加载完成");
            return allbook;
        }
        //存有每本书的信息以，间隔的字符串，一个字符串一本书
        String[] arr=data.split("\n");
        int bookNum=Math.max(arr.length,Constant.Default_sizing);
        allbook=new Book[bookNum];
        allBookNum=arr.length;  //存储的图书的真实数量
        for(int i=0;i<allBookNum;i++){
            String[] tem=arr[i].split(",");
            Book book=new Book(tem[1],
                    tem[2],
                    LocalDateTime.parse(tem[5], DateTimeFormatter.ISO_LOCAL_DATE_TIME),
                    LocalDateTime.parse(tem[6], DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            book.setId(tem[0]);
            book.setAvailable(Boolean.parseBoolean(tem[3]));
            book.setBorrowCount(Integer.parseInt(tem[4]));
            allbook[i]=book;
        }
        System.out.println("数据加载完成");
        return allbook;
    }

    public void storeBook(){
        StringBuilder data=new StringBuilder("");
        for(int i=0;i<Library.library.allBookNum;i++){
            data.append(allbook[i].toString());
            data.append("\n");
        }
        FileUtils.writeFile(data.toString(),Constant.FILE_NAME);
    }

    public void addbook(Book book){
        if(allBookNum>=allbook.length){
            //此时原来存放书籍的数组已经满了需要扩容
            Book[] tem=new Book[allbook.length+4];
            int i=0;
            for(;i<allbook.length;i++){
                tem[i]=allbook[i];
            }
            tem[i]=book;
            allBookNum++;
            allbook=tem;
        }else{
            allbook[allBookNum]=book;
            allBookNum++;
        }
        //添加完成后要将这些书重新写入文件
        Library.library.storeBook();
    }
    public int find (String id){
        for(int i=0;i<allBookNum;i++){
            if(allbook[i].getId().equals(id)){
                return i;
            }
        }
        return -1;
    }
    public void findBook(){
//        Library.library.showBook();
        //  这里写死了 只能用id来查询 后续可以补充方法使用书名来查询
        System.out.println("请输入要查寻的图书的ID：");
        String id= ScannerSingleton.sc.nextLine();
        int index=find(id);
        if(!(index==-1)){
            System.out.println(allbook[index]);
        }else{
            System.out.println("未找到该ID对应的书，请检查输入");
        }
    }
    public void showBook() {
        for(int i=0;i<allBookNum;i++){
            System.out.println(allbook[i]);
        }
    }
    public void quitSystem(){
        library.storeBook();
        System.out.println("正在保存并退出系统；");
        System.exit(0);
    }

    public void updateBook() {
        Library.library.storeBook();
    }

    public void deleteBook() {
        Library.library.showBook();
        Scanner sc=ScannerSingleton.sc;
        System.out.println("请输入要删除的书籍的ID:");
        String id=sc.nextLine();
        int index=find(id);
        if(!(index==-1)){

            for(int i=index;i<allBookNum-1;i++){
                allbook[i]=allbook[i+1];
            }
            allbook[--allBookNum]=null;
        }
        library.storeBook();
        System.out.println("删除已经完成，以下是删除之后的图书情况:");
        library.showBook();
    }

    public void getBorrowedCount() {
        for(int i=0;i<allBookNum;i++){
            System.out.println(allbook[i].getBookName()+"被借阅了"+allbook[i]+"次");
        }
    }

    public void getPopularity() {
        Book[] tem=new Book[allBookNum];
        Arrays.sort(tem);
        System.out.println("输入一个整数k，获得热度排行前k名的书籍：");
        int k=ScannerSingleton.sc.nextInt();
        k=Math.min(k,allBookNum);
        for(int i=0;i<k;i++){
            System.out.println(tem[i]);
        }
    }

    public void getInventoryStatus() {
        // 这里暂时将库存理解为图书馆里存储的所有图书，后续可以用一个新的文件作为数据来源
        library.showBook();
    }

    public void removeOldBook() {
        for(int i=0;i<allBookNum;i++){
            if(!(allbook[i]==null)){
                if(allbook[i].isOverOneYear()){
                    System.out.println("这是超过一年的书籍的id：");
                    System.out.println(allbook[i].getId());
                    library.deleteBook();
                    i--;
                }
            }
        }
    }

    public void borrowBook() {
        library.showBook();
        System.out.println();
        System.out.println("请输入要借阅的书籍的ID：");
        Scanner sc=ScannerSingleton.sc;
        String id=sc.nextLine();
        int index= library.find(id);
        if(!(index==-1)){
            allbook[index].setBorrowCount(allbook[index].getBorrowCount()+1);
            allbook[index].setAvailable(false);
            BorrowedBook tem=new BorrowedBook(((NomalUser)(LibrarySystem.currentuser.realuser)).getUserId(),allbook[index].getId());
            library.addBorrowedBook(tem);
        }else{
            System.out.println("输入错误，没有找到ID对应的书!");
        }
    }

    public BorrowedBook[] loadBorrowedBook(){
        String filename=Constant.FILE_NAME1;
        String data=FileUtils.readFile(filename);
        if(data.equals("")){
            BorrowedBook[] arr=new BorrowedBook[Constant.Default_sizing];
            borrowedBookNum=0;
            System.out.println("数据加载完成");
            return arr;
        }
        String[] tem=data.split("\n");
        int length=Math.min(Constant.Default_sizing2,tem.length);
        BorrowedBook[] arr=new BorrowedBook[length];
        borrowedBookNum=tem.length;
        for(int i=0;i<borrowedBookNum;i++){
            String[] array=tem[i].split(",");
            BorrowedBook b=new BorrowedBook();
            b.setBookId(array[1]);
            b.setUserId(array[0]);
            arr[i]=b;
        }
        System.out.println("数据加载完成");
        return arr;
    }
    public void storeBorrowedBook(){
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<borrowedBookNum;i++){
            if(!(library.allborrowedbook[i]==null)){
                sb.append(library.allborrowedbook[i].toString());
                sb.append("\n");
            }
        }
        FileUtils.writeFile(sb.toString(),Constant.FILE_NAME1);
    }
    public void addBorrowedBook(BorrowedBook tem){
        if(library.borrowedBookNum>=library.allborrowedbook.length){
            BorrowedBook[] arr1=new BorrowedBook[library.allborrowedbook.length+1];
            int i=0;
            for(;i<library.borrowedBookNum;i++){
                arr1[i]=library.allborrowedbook[i];
            }
            arr1[i]=tem;
            allborrowedbook=arr1;
        }else{
            allborrowedbook[library.borrowedBookNum]=tem;
            library.borrowedBookNum++;
        }
        library.storeBorrowedBook();
    }

    public void returnBook() {
        Scanner sc=ScannerSingleton.sc;
        System.out.println("请输入要归还的书的id");
        String id=sc.nextLine();
        for(int i=0;i<library.borrowedBookNum;i++){
            if(library.allborrowedbook[i].getBookId().equals(id)){
                library.allborrowedbook[i]=null;
                System.out.println("已经归还图书!");
                library.storeBorrowedBook();
                return ;
            }
        }
        System.out.println("未找到ID对应的图书");
    }

    public void getOwnStatus() {
        for(int i=0;i<borrowedBookNum;i++){
            System.out.println(library.allborrowedbook[i]);
        }
    }
}
