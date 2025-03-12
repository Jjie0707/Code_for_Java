package test;
//7. 实现图书类Book，包含书名、作者、是否借出状态，编写借阅borrow()和归还returnBook()方法
public class Book {
    public String name;
    public String writer;
    private boolean available;

    public void borrow(){
        this.available=false;
    }
    public void returnBook(){
        this.available=true;
    }
}
