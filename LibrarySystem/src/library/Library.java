package library;

import book.Book;
import com.bit.utils.FileUtils;
import constant.Constant;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Library {
    public static final Library library=new Library();
    private Book[] allbook;
    private BorrowedBook[] allborrowedbook;
    private int allBookNum;

    public Book[] loadBook(){
        //从文件里读取的存有所有图书信息的字符串，以\n分割
        String data=FileUtils.readFile(Constant.FILE_NAME);
        //存有每本书的信息以，间隔的字符串，一个字符串一本书
        String[] arr=data.split("\n");

        int bookNum=Math.max(arr.length,Constant.Default_sizing);
        Book[] allbook=new Book[bookNum];
        for(int i=0;i<arr.length;i++){
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
        allBookNum=bookNum;
        return allbook;
    }

    public void storeBook(){
        StringBuilder data=new StringBuilder("");
        for(int i=0;i<allbook.length;i++){
            data.append(allbook[i].toString());
            data.append("\n");
        }
        FileUtils.writeFile(data.toString(),Constant.FILE_NAME);
    }

    public void addbook(Book book){

    }
}
