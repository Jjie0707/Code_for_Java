package LibrarySystem;

import constant.Constant;
import library.Library;
import user.AdminUser;
import user.NomalUser;
import user.ProxyUser;
import user.User;

public class LibrarySystem {
    public static ProxyUser currentuser;
    public static final Library library=Library.library;
    public static void main(String[] args) {
        library.loadBook();
        library.loadBorrowedBook();
        int choose=ProxyUser.select();
        //被while循环筛选之后的choose返回值只有 1，2，3三种
        User user=null;
        switch(choose){
            case 1->user=new AdminUser("刘备","1001");
            case 2->user=new NomalUser("张飞","1002", Constant.MAX_COUNT);
            case 3->user=new NomalUser("关羽","1003",Constant.MAX_COUNT);
        }
        currentuser=new ProxyUser(user);
        while(true) {
            int option = currentuser.display();
            currentuser.option(option);
        }
    }
}
