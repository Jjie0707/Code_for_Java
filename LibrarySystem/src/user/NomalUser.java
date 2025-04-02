package user;

import constant.Constant;

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

}
