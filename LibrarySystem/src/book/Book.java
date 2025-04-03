package book;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Book implements Comparable<Book>{
    private String id;
    private int borrowCount;
    private boolean available;

    public String bookName;
    public String writerName;
    public  LocalDateTime publishTime;
    public LocalDateTime shelfTime;


    public Book(String bookName, String writerName, LocalDateTime publishTime, LocalDateTime shelfTime) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.publishTime = publishTime;
        this.shelfTime = shelfTime;
    }
    public Book() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public int getBorrowCount() {
        return borrowCount;
    }
    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }
    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }
    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public LocalDateTime getShelfTime() {
        return shelfTime;
    }
    public void setShelfTime(LocalDateTime shelfTime) {
        this.shelfTime = shelfTime;
    }

    @Override
    public String toString() {
        return id+","+bookName+","+writerName+","+available+","+borrowCount+","+publishTime+","+shelfTime;
    }

    @Override
    public int compareTo(Book o) {
        return o.getBorrowCount()-this.getBorrowCount();
    }
    public boolean isOverOneYear() {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 检查上架时间是否为空
        if (shelfTime == null) {
            return false; // 如果上架时间为空，返回 false
        }

        // 计算两个时间之间的月份数差
        long monthsBetween = ChronoUnit.MONTHS.between(shelfTime, now);

        // 如果月份数差大于等于 12，说明已经上架超过一年
        return monthsBetween >= 12;
    }
}
