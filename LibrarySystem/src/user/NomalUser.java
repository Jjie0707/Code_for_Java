package user;

import constant.Constant;
import library.Library;

public class NomalUser extends User{
    private String name;
    private String userId;
    private int maxborrowedcount= Constant.MAX_COUNT;


    public NomalUser() {
    }
    public NomalUser(String name, String userId, int maxborrowedcount) {
        this.name = name;
        this.userId = userId;
        this.maxborrowedcount = maxborrowedcount;
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
    public void findBook(){
        Library.library.findBook();
    }
    public void showBook() {
        Library.library.showBook();;
    }
    public void quitSystem(){
        Library.library.quitSystem();
    }

    public void borrowBoook() {
        Library.library.borrowBook();
    }

    public void returnBook() {
        this.getOwnStatus();
        Library.library.returnBook();
    }

    public void getOwnStatus() {
        Library.library.getOwnStatus();
    }
}
