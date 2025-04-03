package user;

import constant.Constant;
import library.Library;
import utils.ScannerSingleton;

public class ProxyUser {
    public User realuser;

    public ProxyUser(User realuser) {
        this.realuser = realuser;
    }

    public void addbook(){
        if(realuser instanceof AdminUser){
            ((AdminUser) realuser).addBook();
        }else{
            System.out.println("普通用户没有权限上架书籍");
        }
    }
    
    public static int select(){
        System.out.println("请选择要登陆的账户:\n" +
                "1,管理员账户\n"+
                "2，普通用户1（张飞\n"+
                "3，普通用户2（关羽\n"+
                "4，退出系统。");
        while(true){
            int n= ScannerSingleton.sc.nextInt();
            if(1<=n && n<=3){// 1,2,3
                return n;
            }else if(n==4){//4
                Library.library.quitSystem();
            }else{
                System.out.println("输入错误，请重新输入!");
            }
        }
    }
/*
查找图书
显⽰图书
退出系统
上架图书
更新图书
下架图书
查看图书的借阅次数
查看最受欢迎的前K本书
查看库存状态
移除上架超过1年的书籍
 */

/*
借阅图书
归还图书
查看个⼈借阅情况
 */
    public int display() {
        if(realuser instanceof AdminUser){
            System.out.println("以下是管理员账号的权限:\n" +
                    "1,查找图书\n"+
                    "2,查看所有图书\n"+
                    "3,退出系统\n"+
                    "4,上架新图书\n"+
                    "5,更新图书\n"+
                    "6,下架图书\n"+
                    "7,查看图书的借阅次数\n"+
                    "8,查看最受欢迎的前k本书\n"+
                    "9,查看库存状态\n"+
                    "10,移除上架超过一年的书籍\n");
            int choose=ScannerSingleton.sc.nextInt();
            while(true){
                if(1<=choose && choose<=10){
                    return choose;
                }else{
                    System.out.println("输入错误，请重新输入!");
                    choose=ScannerSingleton.sc.nextInt();
                }
            }
        }else {
            System.out.println("以下是普通用户账号的权限:\n" +
                    "1,查找图书\n" +
                    "2,查看所有图书\n" +
                    "3,退出系统\n" +
                    "4,借阅图书\n" +
                    "5,归还图书\n" +
                    "6,查看个人借阅情况\n");

            int choose = ScannerSingleton.sc.nextInt();
            while (true) {
                if (1 <= choose && choose <= 6) {
                    return choose;
                } else {
                    System.out.println("输入错误，请重新输入!");
                    choose = ScannerSingleton.sc.nextInt();
                }
            }
        }
    }

    public void option(int option){
        if(this.realuser instanceof AdminUser){
            switch(option){
                case Constant.findBook -> ((AdminUser)realuser).findBook();
                case Constant.showBook -> ((AdminUser)realuser).showBook();
                case Constant.quitSystem -> ((AdminUser)realuser).quitSystem();

                case Constant.addBook -> ((AdminUser)realuser).addBook();
                case Constant.updateBook -> ((AdminUser)realuser).updateBook();
                case Constant.deleteBook -> ((AdminUser)realuser).deleteBook();
                case Constant.getBorrowedCount -> ((AdminUser)realuser).getBorrowedCount();
                case Constant.getPopularity -> ((AdminUser)realuser).getPopularity();
                case Constant.getInventoryStatus -> ((AdminUser)realuser).getInventoryStatus();
                case Constant.removeOldBook -> ((AdminUser)realuser).removeOldBook();
            }

        }else{
            switch(option){
                case Constant.findBook -> ((NomalUser)realuser).findBook();
                case Constant.showBook -> ((NomalUser)realuser).showBook();
                case Constant.quitSystem -> ((NomalUser)realuser).quitSystem();

                case Constant.borrowBoook -> ((NomalUser)realuser).borrowBoook();
                case Constant.returnBook -> ((NomalUser)realuser).returnBook();
                case Constant.getOwnStatus -> ((NomalUser)realuser).getOwnStatus();
            }
        }
    }
}
