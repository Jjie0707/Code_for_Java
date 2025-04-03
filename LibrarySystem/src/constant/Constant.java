package constant;

public class Constant {
    public static final String FILE_NAME="allbook.tst";   //存储所有图书信息
    public static final String FILE_NAME1= "borrow1.txt";  //普通账号1的借阅情况//普通账号2的借阅情况

    public static final int  Default_sizing=5;
    public static final int  Default_sizing2=5;
    public static final int MAX_COUNT=2;   //每个普通账号的最大借阅权限

    public static final int findBook=1;
    public static final int showBook=2;
    public static final int quitSystem=3;

    public static final int addBook=4;
    public static final int updateBook=5;
    public static final int deleteBook=6;
    public static final int getBorrowedCount=7;
    public static final int getPopularity=8;
    public static final int getInventoryStatus=9;
    public static final int removeOldBook=10;

    public static final int borrowBoook=4;
    public static final int returnBook=5;
    public static final int getOwnStatus=6;
}
/*
查找图书 1
显⽰图书 2
退出系统 3
*/
    //管理员特有权限
/*
上架图书 4
更新图书 5
下架图书 6
查看图书的借阅次数 7
查看最受欢迎的前K本书 8
查看库存状态 9
移除上架超过1年的书籍 10
 */
    //普通用户特有权限
/*
借阅图书 4
归还图书 5
查看个⼈借阅情况 6
 */
